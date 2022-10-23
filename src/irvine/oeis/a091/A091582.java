package irvine.oeis.a091;
// manually 2020-12-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;
import irvine.oeis.a002.A002113;

/**
 * A091582 Number of partitions of the n-th decimal palindrome.
 * @author Georg Fischer
 */
public class A091582 extends Sequence1 {

  protected Sequence mSeqA;
  protected Sequence mSeqB;
  protected int mNA;
  protected Z mTermA;
  protected int mTermB;

  /** Construct the sequence. */
  public A091582() {
    mSeqA = new A000041();
    mSeqB = new A002113();
    mNA = -1;
    mTermB = mSeqB.next().intValue();
  }

  @Override
  public Z next() {
    while (mNA < mTermB) {
      ++mNA;
      mTermA = mSeqA.next(); 
    }
    mTermB = mSeqB.next().intValue();
    return mTermA;
  }

}
