package irvine.oeis.a002;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002431 Numerators in Taylor series for cot x.
 * @author Sean A. Irvine
 */
public class A002431 extends AbstractSequence {

  /** Construct the sequence. */
  public A002431() {
    super(-1);
  }

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Z select(final Q v) {
    final Z t = v.num();
    return t.signum() < 0 ? t : t.negate();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(2L * mN).multiply(2L * mN - 1);
    mB.nextQ();
    final Q b = mB.nextQ();
    final Z s = Z.ONE.shiftLeft(2L * mN);
    final Q t = b.multiply(s).divide(mF);
    return select(t);
  }
}
