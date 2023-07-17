package irvine.oeis.a208;
// manually 2022-02-28

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007623;

/**
 * A208575 Product of digits of n in factorial base.
 * @author Georg Fischer
 */
public class A208575 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A208575(final int offset) {
    super(offset);
  }

  private Sequence mSeq; // underlying sequence
  private int mBase;

  /** Construct the sequence. */
  public A208575() {
    this(0, new A007623(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param base number base
   */
  public A208575(final int offset, final Sequence seq, final int base) {
    super(offset);
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    return ZUtils.digitProduct(mSeq.next(), mBase);
  }
}
