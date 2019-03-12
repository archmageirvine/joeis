package irvine.oeis.a019;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019318.
 * @author Sean A. Irvine
 */
public class A019318 implements Sequence {

  // Translated from Pari

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  private Polynomial<Z> p(final long b, final int n) {
    final Polynomial<Z> c1 = Polynomial.create(b, 1); // x + b
    final Polynomial<Z> c2 = Polynomial.create(b * b, 0, 1); // x^2 + b^2
    final Polynomial<Z> c4 = Polynomial.create(Z.valueOf(b).pow(4), Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE); // x^4+b^4
    if ((n & 1) == 0) {
      return RING.add(RING.add(RING.add(RING.pow(c1, n * n, n),
        RING.multiply(RING.multiply(RING.pow(c1, n, n), RING.pow(c2, (n * n - n) / 2, n), n), Z.TWO)),
        RING.multiply(RING.pow(c2, n * n / 2, n), Z.THREE)),
        RING.multiply(RING.pow(c4, n * n / 4, n), Z.TWO));
    } else {
      return RING.add(RING.add(RING.add(RING.pow(c1, n * n, n),
        RING.multiply(RING.multiply(c1, RING.pow(c4, (n * n - 1) / 4, n)), Z.TWO)),
        RING.multiply(c1, RING.pow(c2, (n * n - 1) / 2, n))),
        RING.multiply(RING.multiply(RING.pow(c1, n, n), RING.pow(c2, (n * n - n) / 2, n)), Z.FOUR));
    }
  }

  @Override
  public Z next() {
    return p(1, ++mN).coeff(mN).divide(8);
  }
}
