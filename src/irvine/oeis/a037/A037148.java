package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A037148 Numerators of Fourier coefficients of Eisenstein series of degree 2 and weight 12 when evaluated at Gram(A_2)*z.
 * @author Sean A. Irvine
 */
public class A037148 extends Sequence0 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Q Q144 = new Q(144);
  private static final Q C2 = new Q(3480192, 691);
  private static final Q C3 = new Q(2037901234176L, 53678953);
  private static final Q C4 = new Q(21009383424000L, 53678953);
  private final Sequence mPhi0Seq = new A004016();
  private final Sequence mDelta12Seq = new A007332();
  private final Polynomial<Q> mPhi0 = RING.empty();
  private final Polynomial<Q> mDelta12 = RING.empty();
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    mPhi0.add(new Q(mPhi0Seq.next()));
    mPhi0.add(Q.ZERO);
    mDelta12.add(new Q(mDelta12Seq.next()));
    mDelta12.add(Q.ZERO);
    final Polynomial<Q> d2 = RING.multiply(mDelta12, mDelta12, mN);
    final Polynomial<Q> d3 = RING.multiply(d2, mDelta12, mN);
    final Polynomial<Q> d4 = RING.multiply(d3, mDelta12, mN);
    final Polynomial<Q> w = RING.add(RING.subtract(RING.add(RING.subtract(RING.pow(mPhi0, 24, mN),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 18, mN), mDelta12, mN), Q144)),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 12, mN), d2, mN), C2)),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 6, mN), d3, mN), C3)),
      RING.multiply(d4, C4));
    return select(w.coeff(mN));
  }
}
