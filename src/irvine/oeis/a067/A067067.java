package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;

/**
 * A067067 Product of nonzero digits of n! (A000142).
 * @author Georg Fischer
 */
public class A067067 extends AbstractSequence {

  private Sequence mSeq; // underlying sequence

  /** Construct the sequence. */
  public A067067() {
    this(0, new A000142());
  }

  /**
   * Generic constructor with parameter
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public A067067(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  @Override
  public Z next() {
    return ZUtils.digitNZProduct(mSeq.next(), 10);
  }
}
