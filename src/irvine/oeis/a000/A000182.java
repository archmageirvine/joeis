package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A000182.
 * @author Sean A. Irvine
 */
public class A000182 implements Sequence {

  protected int mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    ++mN;
    mB.next();
    final Q b = mB.next();
    final Z t = Z.ONE.shiftLeft(2 * mN);
    return b.multiply(t).multiply(t.subtract(Z.ONE)).divide(2 * mN).num().abs();
  }
}

