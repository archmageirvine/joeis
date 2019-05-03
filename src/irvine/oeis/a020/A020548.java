package irvine.oeis.a020;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.EulerPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020548 3rd Euler polynomial evaluated at <code>x=n! (multiplied</code> by <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A020548 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> E3 = EulerPolynomials.eulerPolynomial(3);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.eval(E3, new Q(mF)).multiply(4).toZ();
  }
}
