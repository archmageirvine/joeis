package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389877 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A389877 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mB.nextQ(); // skip odd
    final Q v = mB.nextQ().abs().multiply(Z.ONE.shiftLeft(mN - 1)).divide(Functions.FACTORIAL.z(mN));
    return Functions.DIGIT_LENGTH.z(select(v));
  }
}

