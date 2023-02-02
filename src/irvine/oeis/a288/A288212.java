package irvine.oeis.a288;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A288212 Start with 2n, and if 2n+1 is composite, multiply by the smallest factor of 2n+1; if that number plus 1 is composite, multiply by the smallest factor of that number plus 1; continue until you have a number where z+1 is prime; this is the final z+1, or 0 if sequence diverges.
 * @author Sean A. Irvine
 */
public class A288212 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final PrimeDivision mPrimeDivision = new PrimeDivision(10000000);

  // Hard cases, but where the lpf is confidently known
  private final HashMap<Z, Z> mHardCases = new HashMap<>();
  {
    mHardCases.put(new Z("1658151461612523934210160786231756703739801964685320323733936052636851061474243883100399686061583204219852341749971939932416275560056149605385015871113416466747381335194676015641415828470961339307286193009169155965829268282261446065385232041870905269704417986426614690675720116641"), Z.valueOf(121229832887L));
    mHardCases.put(new Z("201017424592621072090585574452276395646818160109275658388329807511909889880431149802943417384152995038218692598164711414946027160264549348997496469348922208887419031710513504988315839001611299896460009519984004436452321276232044652949615355713727632673674256380095533239756746848651347939681"), Z.valueOf(104661860755129L));
  }

  private Z lpf(final Z u) {
    try {
      final Z lpf = Jaguar.factor(u).leastPrimeFactor();
      if (mVerbose) {
        StringUtils.message(mN + " jaguar " + lpf + " is lpf of " + u);
      }
      return lpf;
    } catch (final UnsupportedOperationException e) {
      // We only require lpf, sometimes we can get it this way even if the entire factorization is unknown
      final FactorSequence fs = new FactorSequence(u);
      mPrimeDivision.factor(fs);
      final Z[] p = fs.toZArray();
      if (p.length > 0 && p[0].isProbablePrime()) {
        if (mVerbose) {
          StringUtils.message(mN + " trial " + p[0] + " is lpf of " + u);
        }
        return p[0];
      } else {
        final Z lpf = mHardCases.get(u);
        if (lpf != null) {
          if (mVerbose) {
            StringUtils.message(mN + " special " + lpf + " is lpf of " + u);
          }
          return lpf;
        }
        throw e;
      }
    }
  }

  @Override
  public Z next() {
    mN = mN.add(2);
    if (mVerbose) {
      StringUtils.message("Starting search for a(" + mN.divide2() + ")");
    }
    Z t = mN;
    Z u;
    while (!(u = t.add(1)).isProbablePrime()) {
      t = t.multiply(lpf(u));
    }
    return u;
  }

  /**
   * Run this sequence for a specific value.
   * @param args value to run
   */
  public static void main(final String... args) {
    final A288212 seq = new A288212();
    seq.mN = new Z(args[0]).multiply2().subtract(2);
    System.out.println(seq.next());
  }
}
