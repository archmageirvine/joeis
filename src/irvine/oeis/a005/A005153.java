package irvine.oeis.a005;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005153 Practical numbers: positive integers m such that every <code>k &lt;=</code> sigma(m) is a sum of distinct divisors of m. Also called panarithmic numbers.
 * @author Sean A. Irvine
 */
public class A005153 implements Sequence {

  private long mN = 0;

  private boolean isPractical(final long n) {
    if ((n & (n - 1)) == 0) {
      return true; // Powers of 2 are members
    }
    if ((n & 1) == 1) {
      return false; // All other terms are even
    }
    final FactorSequence fs = Cheetah.factor(n);
    final Z[] fn = fs.toZArray();
    Arrays.sort(fn);
    Z p = Z.ONE;
    for (int k = 1; k < fn.length; ++k) {
      final Z sigma = Cheetah.factor(fn[k - 1].pow(fs.getExponent(fn[k - 1]))).sigma();
      p = p.multiply(sigma);
      if (fn[k].compareTo(p.add(1)) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isPractical(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
