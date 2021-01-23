package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a004.A004009;

/**
 * A035315 Fourier coefficients of T_{10}.
 * @author Sean A. Irvine
 */
public class A035315 extends A004009 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mE4 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE4.add(super.next());
    return RING.coeff(mE4, RING.pow(RING.eta(RING.x(), mN), 24, mN), mN);
  }
}

