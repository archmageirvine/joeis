package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A133013 Concatenation of next n primes.
 * @author Georg Fischer
 */
public class A133013 extends AbstractSequence {

  protected int mN;
  protected Sequence mSeq;
  private int mBase;
  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A133013() {
    this(1, new A000040(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base for output
   */
  public A133013(final int offset, final Sequence seq, final int base) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    ++mN;
    mS.setLength(0);
    for (int i = 0; i < mN; ++i) {
      mS.append(mSeq.next().toString(mBase));
    }
    return new Z(mS);
  }
}
