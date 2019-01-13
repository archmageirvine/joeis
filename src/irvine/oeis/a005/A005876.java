package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004013;

/**
 * A005876.
 * @author Sean A. Irvine
 */
public class A005876 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.multiply(A004013.phi(mN), RING.pow(A004013.psi(mN), 2, mN)).coeff(mN).multiply2();
  }
}
