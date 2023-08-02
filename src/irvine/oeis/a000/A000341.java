package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000341 Number of ways to pair up {1..2n} so sum of each pair is prime.
 * @author Sean A. Irvine
 */
public class A000341 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private int mN = 0;

  // Ryser's algorithm
  private Z permanent(final int[] a, final int n) {
    Z sum = Z.ZERO;
    final long c = 1L << n;
    // loop over all 2^n submatrices of a
    for (long k = 1; k < c; ++k) {
      // loop columns of submatrix
      Z rowSumProd = Z.ONE;
      int o = 0;
      for (int m = 0; m < n; ++m) {
        long rowSum = 0;
        long v = k;
        for (int p = 0; p < n; ++p) {
          rowSum += (v & 1) * a[o++];
          v >>>= 1;
        }
        rowSumProd = rowSumProd.multiply(rowSum);
      }
      sum = sum.signedAdd(((n - (long) Long.bitCount(k)) & 1) == 0, rowSumProd);
    }
    return sum;
  }

  protected int[] initMatrix(final int n) {
    // mN * mN matrix as a vector
    final int[] matrix = new int[n * n];
    int k = 0;
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= n; ++j) {
        if (mPrime.isPrime(2L * i + 2L * j - 1)) {
          matrix[k] = 1;
        }
        ++k;
      }
    }
    return matrix;
  }

  @Override
  public Z next() {
    ++mN;
    return permanent(initMatrix(mN), mN);
  }
}
