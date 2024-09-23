package irvine.oeis.a329;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a353.A353815;

/**
 * A329963 Numbers k such that sigma(k) is not divisible by 3.
 * @author Georg Fischer
 */
public class A329963 extends AbstractSequence {

  private int mN;
  private final Sequence mSeq;

  /** Construct the sequence. */
  public A329963() {
    this(0, 1, new A353815());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start index of first term 1 in the underlying sequence
   * @param seq underlying sequence
   */
  public A329963(final int offset, final int start, final Sequence seq) {
    super(offset);
    mN = start - 1;
    mSeq = seq;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mSeq.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
