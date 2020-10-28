package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a013.A013973;

/**
 * A035314 Fourier coefficients of T_8.
 * @author Sean A. Irvine
 */
public class A035314 extends A013973 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mE3 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE3.add(super.next());
    return RING.coeff(mE3, RING.pow(RING.eta(RING.x(), mN), 24, mN), mN);
  }
}

