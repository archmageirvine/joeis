package irvine.oeis.a347;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A347063 Double Zumkeller numbers: numbers whose set of divisors can be partitioned into two disjoint subsets with equal sums and equal cardinalities.
 * @author Sean A. Irvine
 */
public class A347063 implements Sequence {

  private long mN = 22;

  @Override
  public Z next() {
    while (true) {
      mN += 2; // apparently always even
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma0().isEven()) {
        final Z sum = fs.sigma();
        if (sum.isEven()) {
          final long target = sum.divide2().longValueExact();
          final Z[] dd = fs.divisors();
          final long[] d = new long[dd.length];
          for (int k = 0; k < dd.length; ++k) {
            d[k] = dd[k].longValue();
          }
          final Z lim = Z.ONE.shiftLeft(d.length);
          for (Z s = Z.ONE.shiftLeft(d.length / 2).subtract(1); s.compareTo(lim) < 0; s = ZUtils.swizzle(s)) {
            long tot = 0;
            for (int k = 0; k < d.length && tot <= target; ++k) {
              if (s.testBit(k)) {
                tot += d[k];
              }
            }
            if (tot == target) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
