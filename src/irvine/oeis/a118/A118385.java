package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a117.A117819;

/**
 * A118385 Concatenation of the first through n-th members of A117819.
 * @author Georg Fischer
 */
public class A118385 extends AbstractSequence {

  protected int mN;
  protected Sequence mSeq;
  private final int mBase;
  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A118385() {
    this(1, new A117819(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base for output
   */
  public A118385(final int offset, final Sequence seq, final int base) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    ++mN;
    mS.append(mSeq.next().toString(mBase));
    return new Z(mS);
  }
}
