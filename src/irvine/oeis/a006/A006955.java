package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006955.
 * @author Sean A. Irvine
 */
public class A006955 implements Sequence {

  private long mN = -1;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mB.next(); // skip odd
    return mB.next().multiply(mN).den();
  }
}
