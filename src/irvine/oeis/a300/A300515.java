package irvine.oeis.a300;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A300515 Expansion of e.g.f. log(Sum_{k&gt;=0} q(k)*x^k/k!), where q(k) = number of partitions of k into distinct parts (A000009).
 * @author Georg Fischer
 */
public class A300515 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A000009(), 1);

  /** Construct the sequence. */
  public A300515() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq1.next();
  }
}
