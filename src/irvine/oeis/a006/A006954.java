package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006954.
 * @author Sean A. Irvine
 */
public class A006954 implements Sequence {

  private long mN = -1;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    ++mN;
    if (mN != 1 && (mN & 1) == 1) {
      ++mN;
      mB.next(); // skip odd
    }
    return mB.next().den();
  }
}
