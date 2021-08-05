package irvine.oeis.a071;
// manually 2021-08-04

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051037;

/**
 * A071520 Number of 5-smooth numbers (A051037) &lt;= n.
 * @author Georg Fischer
 */
public class A071520 implements Sequence {

  protected int mN;
  protected Sequence mSeq;
  protected Z mCount;
  protected int mExpect;

  /** Construct the sequence */
  public A071520() {
    this(1, new A051037());
  }

  /**
   * Generic Constructor with parameter
   * @param offset index of first term
   * @param seq underlying sequence
   */
  protected A071520(final int offset, final Sequence seq) {
    mN = offset - 1;
    mSeq = seq;
    mCount = Z.ZERO;
    mExpect = mSeq.next().intValue();
  }
  
  @Override
  public Z next() {
    ++mN;
    if (mN >= mExpect) {
      mCount = mCount.add(1);
      mExpect = mSeq.next().intValue();
    }
    return mCount;
  }
}
