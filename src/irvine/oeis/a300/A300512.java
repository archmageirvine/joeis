package irvine.oeis.a300;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A300512 Expansion of e.g.f. log(Sum_{k&gt;=0} p(k)*x^k/k!), where p(k) = number of partitions of k (A000041).
 * @author Georg Fischer
 */
public class A300512 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A000041(), 1);

  /** Construct the sequence. */
  public A300512() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq1.next();
  }
}
