package irvine.oeis.a027;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027641 Numerator of Bernoulli number B_n.
 * @author Sean A. Irvine
 */
public class A027641 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    return mB.nextQ().num();
  }
}
