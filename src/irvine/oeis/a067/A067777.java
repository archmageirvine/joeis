package irvine.oeis.a067;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067777 Numbers k such that (2*k)! * B(6*k) is an integer where B(k) are the Bernoulli numbers B(1)=-1/2 B(2)=1/6 B(4)=-1/30... B(2*m+1)=0 m&gt;1.
 * @author Sean A. Irvine
 */
public class A067777 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      for (int k = 0; k < 5; ++k) {
        mB.nextQ();
      }
      mF = mF.multiply(++mN).multiply(++mN);
      if (mB.nextQ().multiply(mF).isInteger()) {
        return Z.valueOf(mN / 2);
      }
    }
  }
}
