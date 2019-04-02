package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A003244 Number of unrooted achiral trees with n nodes.
 * @author Sean A. Irvine
 */
public class A003244 extends A003241 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = 0;
  private Polynomial<Z> mA3238 = RING.zero();

  @Override
  public Z next() {
    final Z a = super.next();
    mA3238 = RING.add(mA3238, RING.monomial(get(++mN), mN));
    return a.subtract(RING.subtract(RING.pow(mA3238, 2, mN), mA3238.substitutePower(2, mN)).coeff(mN).divide2());
  }
}
