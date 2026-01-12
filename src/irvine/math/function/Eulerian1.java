package irvine.math.function;

import irvine.math.z.Z;

/**
 * Eulerian numbers of the first kind (see A173018).
 * @author Georg FIscher
 */
class Eulerian1 extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long k) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= k + 1; ++j) {
      sum = sum.add(Functions.BINOMIAL.z(n + 1, k - j + 1)
        .multiply(Z.valueOf(j).pow(n)).multiply(((k - j + 1) & 1) == 0 ? 1 : -1));
    }
    return sum;
  }
}
