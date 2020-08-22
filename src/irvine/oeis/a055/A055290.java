package irvine.oeis.a055;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A055290 Triangle of trees with n nodes and k leaves, 2 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A055290 extends A055277 {

  private static final Polynomial<Polynomial<Q>> CONS = RING_X.add(RING_X.subtract(RING_X.one(), RING_X.x()), XY);

  private Polynomial<Polynomial<Q>> mGF = super.gf(1);
  private int mDeg = 1;

  @Override
  protected Polynomial<Polynomial<Q>> gf(final int n) {
    if (n > mDeg) {
      final Polynomial<Polynomial<Q>> b = super.gf(n);
      final Polynomial<Polynomial<Q>> bSubs = doubleSubstitute(b, 2);
      final Polynomial<Polynomial<Q>> bSquare = RING_X.multiply(b, b, n);
      mGF = RING_X.add(RING_X.multiply(CONS, b),
        RING_X.multiply(RING_X.subtract(bSubs, bSquare), constant(Q.HALF)));
      mDeg = n;
    }
    return mGF;
  }

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 2;
      ++mN;
    }
    return gf(mN).coeff(mN).coeff(mM).toZ();
  }
}
