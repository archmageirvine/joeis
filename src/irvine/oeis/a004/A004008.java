package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004008.
 * @author Sean A. Irvine
 */
public class A004008 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NEGX = RING.negate(RING.x());
  private int mN = -1;


  @Override
  public Z next() {
    final Polynomial<Z> a = ThetaFunctions.theta3z(++mN);
    final Polynomial<Z> a3 = RING.pow(a, 3, mN);
    final Polynomial<Z> a4 = RING.pow(a, 4, mN);
    final Polynomial<Z> b = RING.substitute(a, NEGX, mN);
    final Polynomial<Z> b4 = RING.pow(b, 4, mN);
    final Polynomial<Z> c = RING.subtract(RING.multiply(a4, Z.EIGHT), RING.multiply(b4, Z.SEVEN));
    final Polynomial<Z> d = RING.multiply(a3, c);
    return d.coeff(mN);
  }
}
