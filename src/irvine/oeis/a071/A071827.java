package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007770;

/**
 * A071827 Concatenate first n terms of A007770 in reverse order.
 * @author Georg Fischer
 */
public class A071827 extends AbstractSequence {

  protected int mN;
  protected Sequence mSeq;
  private final int mBase;
  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A071827() {
    this(1, new A007770(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base for output
   */
  public A071827(final int offset, final Sequence seq, final int base) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    mS.insert(0, mSeq.next().toString(mBase));
    return new Z(mS.toString());
  }
}
