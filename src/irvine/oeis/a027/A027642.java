package irvine.oeis.a027;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027642 Denominator of Bernoulli number B_n.
 * @author Sean A. Irvine
 */
public class A027642 extends Sequence0 {
  
  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    return mB.nextQ().den();
  }
}
