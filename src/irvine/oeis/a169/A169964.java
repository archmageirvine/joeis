package irvine.oeis.a169;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007088;

/**
 * A169964 Numbers whose decimal expansion contains only 0's and 5's.
 * @author Georg Fischer
 */
public class A169964 extends AbstractSequence {

  protected Z mDigit;
  private final A007088 mSeq = new A007088();

  /** Construct the sequence. */
  public A169964() {
    this(1, 5);
  }

  /**
   * Generic constructor with parameter
   * @param offset offset of the sequence
   * @param parm digit to multiply on A007088
   */
  public A169964(final int offset, final int parm) {
    super(offset);
    mDigit = Z.valueOf(parm);
  }

  @Override
  public Z next() {
    return mSeq.next().multiply(mDigit);
  }
}
