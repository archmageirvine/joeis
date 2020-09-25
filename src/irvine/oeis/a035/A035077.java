package irvine.oeis.a035;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035077 Denominators of partial sums of Bernoulli numbers B_{2n} = A000367/A002445.
 * @author Sean A. Irvine
 */
public class A035077 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mSum = mSum.add(mB.nextQ());
    mB.nextQ();
    return select(mSum);
  }
}
