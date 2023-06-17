package irvine.oeis.a001;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001067 Numerator of Bernoulli(2*n)/(2*n).
 * @author Sean A. Irvine
 */
public class A001067 extends AbstractSequence {

  /* Construct the sequence. */
  public A001067() {
    super(1);
  }

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mB.nextQ(); // skip odd terms
    final Q s = mB.nextQ().divide(mN);
    return s.num();
  }
}

