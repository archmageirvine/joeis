package irvine.oeis.a056;

import irvine.math.IntegerUtils;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A056017 Permutation of nonnegative integers formed by ranking fibbinary numbers (A003714) as if they were representatives of the circular binary sequences with forbidden -11- subsequence.
 * @author Sean A. Irvine
 */
public class A056017 extends A003714 {

  private Z zeckendorf(final long n) {
    int k = 2;
    long m = n;
    Z sum = Z.ZERO;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum = sum.add(Fibonacci.fibonacci(k));
      }
      m >>>= 1;
      ++k;
    }
    return sum;
  }

  @Override
  public Z next() {
    final int n = super.next().intValueExact();
    if (n == 0) {
      return Z.ZERO;
    }
    return Fibonacci.fibonacci(IntegerUtils.log2(n) + ((n & 1) == 0 ? -1 : 1)).add(zeckendorf(n / ((n & 1) == 0 ? 2 : 4)));
  }
}
