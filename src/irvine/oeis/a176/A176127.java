package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A176127 The number of permutations of <code>{1,2,</code>...,n,1,2,...,n} with the property that there are k numbers between the two k's in the set for k=1,...,n.
 * @author Sean A. Irvine
 */
public class A176127 implements Sequence {

  // Some algorithms for computing this sequence as discussed in "Counting Skolem Sequences",
  // A. Assarpour, A, Bar-Noy, O. Liu, 2017.
  // This implementation is based on the Godfrey approach.
  // Include Gray code optimization to reduce the number of polynomial evaluations.
  // There are other potential symmetries not exploited here.

  private int mN = 0;

  private int bit(final long x, final int k) {
    // converts bit 0 into 1, bit 1 into -1
    return 1 - 2 * (int) ((x >>> k) & 1);
  }

  private Z prod(final long... v) {
    Z prod = Z.ONE;
    for (final long x : v) {
      prod = prod.multiply(x);
    }
    return prod;
  }

  private void zeroCase(final long[] sum) {
    for (int k = 0; k < sum.length; ++k) {
      sum[k] = 2 * sum.length - k;
    }
  }

  private Z godfrey(final int n) {
    final int r = n & 3;
    if (r == 1 || r == 2) {
      return Z.ZERO;
    }
    final int m = 2 * n;
    // x is {+1,-1}^2n vector, here using bit 0 for 1 and bit 1 for -1
    long gray = 0;
    boolean sign = true;
    final long[] sum = new long[n];
    zeroCase(sum);
    Z s = prod(sum);
    for (long x = 1; x < 1L << m; ++x) {
      sign = !sign;
      final int p = Long.numberOfTrailingZeros(x);
      gray ^= 1L << p;
      // Only position p in gray has changed; i.e., bit(gray, p) swapped sign,
      // hence we add the changed value multiplied to 2.
      final int a = 2 * bit(gray, p);
      for (int j = 0; j < n && p < m - j; ++j) {
        sum[j] += a * bit(gray, p + j + 2);
      }
      s = s.signedAdd(sign, prod(sum));
    }
    return s.shiftRight(m);
  }

  @Override
  public Z next() {
    return godfrey(++mN);
  }
}
