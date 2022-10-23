package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032181 Number of ways to partition n labeled elements into pie slices each of at least 2 elements.
 * @author Sean A. Irvine
 */
public class A032181 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.TWO, Q.ONE));
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.log(RING.series(RING.one(), RING.subtract(C, RING.exp(RING.x(), mN)), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
