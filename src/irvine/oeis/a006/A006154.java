package irvine.oeis.a006;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006154 Number of labeled ordered partitions of <code>an</code> n-set into odd parts.
 * @author Sean A. Irvine
 */
public class A006154 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.one(), RING.subtract(RING.one(), RING.sinh(RING.x(), mN)), mN).multiply(mF).toZ();
  }
}

