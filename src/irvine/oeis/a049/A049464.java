package irvine.oeis.a049;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049464 Number of n-photon quenched skeletons.
 * @author Sean A. Irvine
 */
public class A049464 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, Q.TWO));
  private Polynomial<Q> mGf = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mGf = RING.series(
      RING.add(RING.add(
        RING.x(),
        RING.multiply(RING.pow(mGf, 2, mN), RING.onePlusXToTheN(1), mN)),
        RING.multiply(RING.multiply(mGf, RING.diff(mGf), mN), Q.TWO).shift(1)),
      C1, mN);
    return mGf.coeff(mN).toZ();
  }
}
