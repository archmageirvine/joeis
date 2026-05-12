package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A120512 a(n) = min{j : A120501(j) = n}.
 * @author Georg Fischer
 */
public class A120512 extends AbstractSequence {

  private long mN;
  private long mJ; // result
  private AbstractSequence mSeq;

  /** Construct the sequence. */
  public A120512() {
    this(1, new A120501());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A120512(final int offset, final AbstractSequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mJ = mSeq.getOffset();
  }

  @Override
  public Z next() {
    ++mN;
    while (!mSeq.next().equals(Z.valueOf(mN))) {
      ++mJ;
    }
    return Z.valueOf(mJ++);
  }
}
