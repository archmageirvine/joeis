package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006954 Denominators of Bernoulli numbers <code>B_0, B_1, B_2, B_4, B_6, ..</code>.
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
      mB.nextQ(); // skip odd
    }
    return mB.nextQ().den();
  }
}
