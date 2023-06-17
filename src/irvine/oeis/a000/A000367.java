package irvine.oeis.a000;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000367 Numerators of Bernoulli numbers B_2n.
 * @author Sean A. Irvine
 */
public class A000367 extends AbstractSequence {

  /** Construct the sequence. */
  public A000367() {
    super(0);
  }

  final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z q = mB.nextQ().num();
    mB.nextQ();
    return q;
  }
}
