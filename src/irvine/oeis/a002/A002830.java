package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002830 Number of 3-edge-colored trivalent graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A002830 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mGF = RING.zero();
  private int mN = -1;
  private final A002831 mSeq = new A002831();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mGF = RING.add(mGF, RING.monomial(new Q(mSeq.next()), mN));
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      sum = RING.add(sum, RING.divide(mGF.substitutePower(k, mN), new Q(k)));
    }
    return RING.exp(sum, mN).coeff(mN).toZ();
  }
}
