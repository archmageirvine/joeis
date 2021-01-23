package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006665 G.f.: { ( Product_{j=1..infinity} (1-x^j) - 1 )/x }^24.
 * @author Sean A. Irvine
 */
public class A006665 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.subtract(RING.eta(RING.x(), mN + 1), RING.one()).shift(-1), 24, mN).coeff(mN);
  }
}
