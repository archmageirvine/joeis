package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a152.A152944;

/**
 * A058639 McKay-Thompson series of class 34a for the Monster group.
 * @author Sean A. Irvine
 */
public class A058639 extends A152944 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(new Q(super.next()));
    return RING.sqrt(mA, ++mN).coeff(mN).toZ();
  }
}
