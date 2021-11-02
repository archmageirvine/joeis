package irvine.oeis.a091;
// manually 2020-12-16

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a002.A002113;

/**
 * A091583 Number of partitions of the n-th decimal palindrome into distinct integers.
 * @author Georg Fischer
 */
public class A091583 implements Sequence {

  protected Sequence mSeqA;
  protected Sequence mSeqB;
  protected int mNA;
  protected Z mTermA;
  protected int mTermB;

  /** Construct the sequence. */
  public A091583() {
    mSeqA = new A000009();
    mSeqB = new A002113();
    mTermB = mSeqB.next().intValue();
    mNA = -1;
  }

  @Override
  public Z next() {
    while (mNA < mTermB) {
      ++mNA;
      mTermA = mSeqA.next(); // = A000009(mN)
    }
    mTermB = mSeqB.next().intValue();
    return mTermA;
  }

}
