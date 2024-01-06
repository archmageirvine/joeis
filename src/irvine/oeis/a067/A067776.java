package irvine.oeis.a067;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067776 Numbers k such that binomial(2*k,k) * B(2*k) is an integer where B(k) are the Bernoulli numbers B(1)=-1/2 B(2)=1/6 B(4)=-1/30... B(2*m+1)=0 m&gt;1.
 * @author Sean A. Irvine
 */
public class A067776 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mB.nextQ();
      if (mB.nextQ().multiply(Binomial.binomial(2 * ++mN, mN)).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
