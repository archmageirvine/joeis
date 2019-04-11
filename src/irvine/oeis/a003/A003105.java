package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003105 Schur's 1926 partition theorem: number of partitions of n into parts <code>6n+1</code> or <code>6n-1</code>.
 * @author Sean A. Irvine
 */
public class A003105 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN > 0) {
      mDen = RING.multiply(mDen, RING.add(RING.oneMinusXToTheN(mN), RING.monomial(Q.ONE, 2 * mN)));
    }
    return RING.coeff(RING.one(), mDen, mN).toZ();
  }
}
