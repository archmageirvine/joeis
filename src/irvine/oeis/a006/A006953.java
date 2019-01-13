package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006953.
 * @author Sean A. Irvine
 */
public class A006953 implements Sequence {

  private long mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    mB.next(); // skip odd
    return mB.next().divide(mN).den();
  }
}
