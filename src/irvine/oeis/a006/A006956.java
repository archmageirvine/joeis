package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006956.
 * @author Sean A. Irvine
 */
public class A006956 implements Sequence {

  private long mN = -3;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    if (mN < 3) {
      return Z.ONE;
    }
    mB.next(); // skip odd
    return mB.next().multiply(mN).multiply(mN + 1).den();
  }
}
