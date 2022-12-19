package irvine.oeis.a316;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a020.A020555;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A316972 Number of connected multiset partitions of {1, 1, 2, 2, 3, 3, ..., n, n}.
 * @author Georg Fischer
 */
public class A316972 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A020555(), 1);

  /** Construct the sequence. */
  public A316972() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next();
  }
}
