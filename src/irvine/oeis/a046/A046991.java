package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046991 Denominators of Taylor series for log(1/cos(x)). Also from log(cos(x)).
 * @author Sean A. Irvine
 */
public class A046991 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.log(RING.cos(RING.x(), mN), mN).coeff(mN).den();
  }
}
