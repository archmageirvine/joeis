package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395223 allocated for Ali Sidheek.
 * @author Sean A. Irvine
 */
public class A395223 extends Sequence1 {

  // After Ali Sidheek

  private int mN = 1;

  private long bigL(final int b, final int r) {
    if (r <= 1) {
      return 1;
    }
    //return CR.ONE.subtract(CR.valueOf(r).log().divide(CR.valueOf(b).log())).inverse().floor().longValueExact();
    return (long) Math.floor(1.0 / (1.0 - Math.log(r) / Math.log(b))); // this approximation is much faster
  }

  private final MemoryFunction1<Z> mF = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int b) {
      long s = 0;
      final FactorSequence fs = Jaguar.factor(b - 1);
      for (int r = 1; r < b; ++r) {
        long d = 1;
        boolean bad = false;
        for (final Z pz : fs.toZArray()) {
          final int a = fs.getExponent(pz);
          final long q = pz.pow(a).longValueExact();
          if (r % q == 0) {
            continue;
          }
          final long p = pz.longValueExact();
          int e = 0;
          int t = r;
          while (t % p == 0) {
            t /= p;
            ++e;
          }
          if (e > 0 && e < a) {
            bad = true;
            break;
          }
          d = Functions.LCM.l(d, Functions.ORDER.l(q, r));
        }
        s += bad ? 1 : 1 + (bigL(b, r) - 1) / d;
      }
      return Z.valueOf(s);
    }
  };

  private final MemoryFunction1<Long> mG = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int c) {
      return (long) (c - 2) + bigL(c, c - 1);
    }
  };

  private boolean isTerm(final int b) {
    final Z nb = mF.get(b);
    boolean found = false;
    for (int c = b + 1; c <= nb.intValueExact() + 1; ++c) {
      if (mG.get(c) <= nb.longValue() && mF.get(c).equals(nb)) {
        found = true;
        break;
      }
    }
    if (!found) {
      return false;
    }
    for (int k = 2; k < b; ++k) {
      if (mF.get(k).equals(nb)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (isTerm(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
