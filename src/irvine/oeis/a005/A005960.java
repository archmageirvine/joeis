package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005960 Number of acyclic disubstituted alkanes with n carbon atoms and distinct substituents.
 * @author Sean A. Irvine
 */
public class A005960 extends A000625 {

  {
    setOffset(1);
  }

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> b = RING.subtract(RING.one(), RING.pow(a, 2, mN).shift(1));
    return RING.coeff(RING.one(), b, mN);
  }
}
