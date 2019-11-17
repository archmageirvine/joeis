package irvine.oeis.a027;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027641 Numerator of Bernoulli number <code>B_n</code>.
 * @author Sean A. Irvine
 */
public class A027641 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    return mB.nextQ().num();
  }
}
