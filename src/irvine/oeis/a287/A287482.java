package irvine.oeis.a287;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a241.A241843;

/**
 * A287482 Number of disconnected simple non-chordal graphs on n vertices.
 * @author Georg Fischer
 */
public class A287482 extends AbstractSequence {

  private A287481 mSeq1 = new A287481();
  private A241843 mSeq2 = new A241843();

  /** Construct the sequence. */
  public A287482() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
