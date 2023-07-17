package irvine.oeis.a002;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002445 Denominators of Bernoulli numbers B_{2n}.
 * @author Sean A. Irvine
 */
public class A002445 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002445(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002445() {
    super(0);
  }

  final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z q = mB.nextQ().den();
    mB.nextQ();
    return q;
  }
}
