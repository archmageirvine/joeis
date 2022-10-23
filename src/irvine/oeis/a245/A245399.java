package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024638;

/**
 * A245399 Number of nonnegative integers with property that their base 6/5 expansion (see A024638) has n digits.
 * @author Georg Fischer
 */
public class A245399 extends Sequence1 {

  private Z mLim = Z.TEN;
  private int mCount = 0;
  private final Sequence mSeq;

  /** Construct the sequence. */
  public A245399() {
    this(new A024638());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence
   */
  public A245399(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    Z n = mSeq.next();
    while (n.compareTo(mLim) < 0) {
      ++mCount;
      n = mSeq.next();
    }
    mLim = mLim.multiply(10);
    final Z result = Z.valueOf(mCount);
    mCount = 1;
    return result;
  }
}
