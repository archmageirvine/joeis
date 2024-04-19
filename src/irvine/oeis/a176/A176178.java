package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000396;

/**
 * A176178 Concatenation of perfect numbers written in base 2.
 * @author Georg Fischer
 */
public class A176178 extends AbstractSequence {

  protected int mN;
  protected Sequence mSeq;
  private final int mBase;
  private int mPos; // position in mS
  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A176178() {
    this(1, new A000396(), 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base for output
   */
  public A176178(final int offset, final Sequence seq, final int base) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mBase = base;
    mPos = 1;
  }

  @Override
  public Z next() {
    if (mPos >= mS.length()) {
      mS.setLength(0);
      mS.append(mSeq.next().toString(mBase));
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos++) - '0');
  }
}
