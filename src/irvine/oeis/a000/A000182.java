package irvine.oeis.a000;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000182 Tangent (or "Zag") numbers: e.g.f. tan(x), also (up to signs) e.g.f. tanh(x).
 * @author Sean A. Irvine
 */
public class A000182 extends Sequence1 {

  protected int mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    ++mN;
    mB.nextQ();
    final Q b = mB.nextQ();
    final Z t = Z.ONE.shiftLeft(2 * mN);
    return b.multiply(t).multiply(t.subtract(Z.ONE)).divide(2 * mN).num().abs();
  }
}

