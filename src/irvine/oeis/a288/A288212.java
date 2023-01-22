package irvine.oeis.a288;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061112.
 * @author Sean A. Irvine
 */
public class A288212 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final PrimeDivision mPrimeDivision = new PrimeDivision(10000000);

  @Override
  public Z next() {
    mN = mN.add(2);
    if (mVerbose) {
      StringUtils.message("Starting search for a(" + mN.divide2() + ")");
    }
    Z t = mN;
    Z u;
    while (!(u = t.add(1)).isProbablePrime()) {
      try {
        final Z lpf = Jaguar.factor(u).leastPrimeFactor();
        if (mVerbose) {
          StringUtils.message(mN + " " + lpf + " is lpf of " + u);
        }
        t = t.multiply(lpf);
      } catch (final UnsupportedOperationException e) {
        // We only require lpf, sometimes we can get it this way even if the entire factorization is unknown
        final FactorSequence fs = new FactorSequence(u);
        mPrimeDivision.factor(fs);
        final Z[] p = fs.toZArray();
        if (p.length > 0 && p[0].isProbablePrime()) {
          if (mVerbose) {
            StringUtils.message(mN + " " + p[0] + " is lpf of " + u);
          }
          t = t.multiply(p[0]);
        } else {
          throw e;
        }
      }
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
