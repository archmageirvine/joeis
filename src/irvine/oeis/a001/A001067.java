package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A001067.
 * @author Sean A. Irvine
 */
public class A001067 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mB.next(); // skip odd terms
    final Q s = mB.next().divide(mN);
    return s.num();
  }
}

