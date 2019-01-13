package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000022.
 * @author Sean A. Irvine
 */
public class A000022 extends A000678 {

  private static final int LIMIT = 100;

  private Polynomial<Q> mSum;

  /** Construct the sequence. */
  public A000022() {
    super.next();
    mSum = mQ;
  }

  @Override
  protected int limit() {
    return LIMIT;
  }

  @Override
  public Z next() {
    if (mN >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    final Polynomial<Q> oldG = mG;
    final Polynomial<Q> oldQ = mQ;
    super.next();
    final Polynomial<Q> tb = RING.subtract(mG, oldG);
    final Polynomial<Q> ts = RING.subtract(mG, RING.one());
    final Polynomial<Q> q2 = RING.multiply(tb, ts).truncate(2 * LIMIT);
    mSum = RING.add(mSum, RING.subtract(RING.subtract(mQ, oldQ), q2).truncate(2 * LIMIT));
    return mSum.coeff(mN - 1).toZ();
  }
}

