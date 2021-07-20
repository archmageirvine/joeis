package irvine.oeis.a002;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002432 Denominators of zeta(2*n)/Pi^(2*n).
 * @author Sean A. Irvine
 */
public class A002432 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.den().abs();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.HALF);
    }
    mF = mF.multiply(2 * mN).multiply(2 * mN - 1);
    mB.nextQ();
    final Q b = mB.nextQ();
    final Z s = Z.ONE.shiftLeft(2 * mN - 1);
    final Q t = b.multiply(s).divide(mF);
    return select(t);
  }
}
