package irvine.oeis.a000;

/**
 * A000348 Number of ways to pair up {1^2, 2^2, ..., (2n)^2 } so sum of each pair is prime.
 * @author Sean A. Irvine
 */
public class A000348 extends A000341 {

  @Override
  protected int[] initMatrix(final int n) {
    // mN * mN matrix as a vector
    final int[] matrix = new int[n * n];
    int k = 0;
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= n; ++j) {
        final int i2 = 2 * i;
        final int j2 = 2 * j - 1;
        if (mPrime.isPrime(i2 * i2 + j2 * j2)) {
          matrix[k] = 1;
        }
        ++k;
      }
    }
    return matrix;
  }
}
