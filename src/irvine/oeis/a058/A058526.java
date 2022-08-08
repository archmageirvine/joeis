package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a052.A052241;

/**
 * A058526 McKay-Thompson series of class 16e for the Monster group.
 * @author Sean A. Irvine
 */
public class A058526 extends A052241 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Q.ZERO);
      mA.add(Q.FOUR);
      mA.add(Q.ZERO);
      mA.add(Q.ZERO);
      super.next();
    } else {
      mA.add(Q.ZERO);
      mA.add(Q.ZERO);
      mA.add(Q.ZERO);
    }
    mA.add(new Q(super.next()));
    return RING.sqrt1p(mA, mN).coeff(mN).toZ();
  }
}
