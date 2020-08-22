package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032182 "CIJ" (necklace, indistinct, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032182 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.TWO, Q.NEG_ONE));
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.log(RING.series(RING.one(), RING.subtract(C, RING.exp(RING.x(), mN)), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
