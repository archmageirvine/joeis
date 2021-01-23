package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A037146 Numerators of Fourier coefficients of Eisenstein series of degree 2 and weight 10 when evaluated at Gram(A_2)*z.
 * @author Sean A. Irvine
 */
public class A037146 implements Sequence {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Q Q120 = new Q(120);
  private static final Q Q1728 = new Q(1728);
  private static final Q C = new Q(1330587648, 43867);
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
    final Polynomial<Q> w = RING.add(RING.add(RING.subtract(RING.pow(mPhi0, 20, mN),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 14, mN), mDelta12, mN), Q120)),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 8, mN), d2, mN), Q1728)),
      RING.multiply(RING.multiply(RING.pow(mPhi0, 2, mN), d3, mN), C));
    return select(w.coeff(mN));
  }
}

