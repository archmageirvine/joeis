package irvine.oeis.a067;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067656 Numbers n such that n!*B(2n) is an integer, where B(2n) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A067656 extends Sequence1 {

  private long mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(1);
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mB.nextQ();
      if (mB.nextQ().multiply(mF).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
