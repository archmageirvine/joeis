package irvine.oeis.a000;

import irvine.math.api.RationalSequence;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000367 Numerators of Bernoulli numbers B_2n.
 * @author Sean A. Irvine
 */
public class A000367 extends AbstractSequence implements RationalSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000367(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000367() {
    super(0);
  }

  final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z qn = mB.nextQ().num();
    mB.nextQ();
    return qn;
  }

  @Override
  public Q nextQ() {
    final Q q = mB.nextQ();
    mB.nextQ();
    return q;
  }

}
