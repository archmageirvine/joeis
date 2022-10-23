package irvine.oeis.a043;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043304 Denominator of B(4n+2)/(8n+4) where B(m) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A043304 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(3);
  private int mN = 0;

  @Override
  public Z next() {
    for (int k = 0; k < 3; ++k) {
      mB.nextQ();
    }
    return mB.nextQ().divide(8 * ++mN + 4).den();
  }
}

