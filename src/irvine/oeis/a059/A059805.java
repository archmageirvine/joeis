package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000027;

/**
 * A059805 Natural numbers written with digits grouped in pairs and leading zeros omitted.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A059805 extends Sequence1 {

  private final int mTuple;
  private final int mSlide;
  private final Sequence mSeq;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A059805() {
    this(new A000027(), 0, 2, 2);
  }

  protected A059805(final Sequence seq, final int skip, final int tuple) {
    this(seq, skip, tuple, tuple);
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence
   * @param skip number of leading terms to be skipped in <em>seq</em>
   * @param tuple number of digits (2=pair, 3=triple)
   * @param slide how far the sequence moves at each step (usually either 1 or <code>tuple</code>
   */
  protected A059805(final Sequence seq, int skip, final int tuple, final int slide) {
    mSeq = seq;
    while (--skip >= 0) {
      mSeq.next();
    }
    mTuple = tuple;
    mSlide = slide;
  }

  @Override
  public Z next() {
    while (mSb.length() < mTuple) {
      mSb.append(mSeq.next());
    }
    final Z result = new Z(mSb.substring(0, mTuple));
    mSb.delete(0, mSlide);
    return result;
  }
}
