package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032172 Number of rooted compound windmills with n nodes and leaves of 2 colors with no symmetries.
 * @author Sean A. Irvine
 */
public class A032172 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    mA = RING.add(TWO, A032171.chk(mA.shift(1), ++mN));
    return mA.coeff(mN).toZ();
  }
}
