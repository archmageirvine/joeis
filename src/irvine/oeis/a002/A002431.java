package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;
import irvine.math.q.BernoulliSequence;

/**
 * A002431 Numerators in Taylor series for cot x.
 * @author Sean A. Irvine
 */
public class A002431 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(2 * mN).multiply(2 * mN - 1);
    mB.next();
    final Q b = mB.next();
    final Z s = Z.ONE.shiftLeft(2 * mN);
    final Z t = b.multiply(s).divide(mF).num();
    return t.signum() < 0 ? t : t.negate();
  }
}
