package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386213 Integers t having at least one nonempty subset of the set of its proper divisors for which the equation sigma(t) + r = m*t (m is any integer &gt; 1, r is the sum of elements of such subset) is true.
 * @author Sean A. Irvine
 */
public class A386213 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      final Z sigma = Functions.SIGMA1.z(mN);
      if (d.length > Long.SIZE) {
        throw new UnsupportedOperationException();
      }
      long cnt = 0;
      for (long set = 0; set < 1L << (d.length - 1); ++set) {
        long s = set;
        Z sum = sigma;
        for (int k = 0; s != 0; ++k, s >>>= 1) {
          if ((s & 1) == 1) {
            sum = sum.add(d[k]);
          }
        }
        if (sum.mod(mN) == 0 && sum.compareTo(mN) > 0) {
          ++cnt;
        }
      }
      if (cnt != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
