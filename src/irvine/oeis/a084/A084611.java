package irvine.oeis.a084;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084611 a(n) = sum of absolute values of coefficients of (1+x-x^2)^n.
 * @author Sean A. Irvine
 */
public class A084611 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> p = RING.pow(Polynomial.create(1, 1, -1), ++mN);
    Z sum = Z.ZERO;
    for (int k = 0; k <= p.degree(); ++k) {
      sum = sum.add(p.coeff(k).abs());
    }
    return sum;
  }
}

