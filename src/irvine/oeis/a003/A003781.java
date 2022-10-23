package irvine.oeis.a003;

import irvine.math.IntegerUtils;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003781 Expansion of theta series of {E_7}* lattice in powers of q^(1/2).
 * @author Sean A. Irvine
 */
public class A003781 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> NEG_X = Polynomial.create(0, -1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.one();
    for (int k = 1; k <= IntegerUtils.sqrt(mN); ++k) {
      sum = RING.add(sum, RING.monomial(Z.TWO, k * k));
    }
    final Polynomial<Z> a = RING.multiply(RING.pow(RING.substitute(sum, NEG_X, mN), 4, mN), Z.SEVEN);
    final Polynomial<Z> b = RING.add(a, RING.pow(sum, 4, mN));
    final Polynomial<Z> c = RING.multiply(RING.pow(sum, 3, mN), b, mN);
    return c.coeff(mN).divide(8);
  }
}
