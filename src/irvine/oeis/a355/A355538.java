package irvine.oeis.a355;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013939;

/**
 * A355538 Partial sum of A001221 (number of distinct prime factors) minus 1, ranging from 2 to n.
 * @author Georg Fischer
 */
public class A355538 extends AbstractSequence {

  private A013939 mSeq1 = new A013939();
  private long mN;

  /** Construct the sequence. */
  public A355538() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mN - 1);
  }
}
