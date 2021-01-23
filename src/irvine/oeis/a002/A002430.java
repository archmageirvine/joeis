package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;
import irvine.math.q.BernoulliSequence;

/**
 * A002430 Numerators in Taylor series for tan(x). Also from Taylor series for tanh(x).
 * @author Sean A. Irvine
 */
public class A002430 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(2 * mN).multiply(2 * mN - 1);
    mB.nextQ();
    final Q b = mB.nextQ();
    final Z s = Z.ONE.shiftLeft(2 * mN);
    return b.multiply(s.multiply(s.subtract(1))).divide(mF).num().abs();
  }
}
