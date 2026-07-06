package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A130233 a(n) is the maximal k such that Fibonacci(k) &lt;= n (the "lower" Fibonacci Inverse).
 * @author Georg Fischer
 */
// A130234 a(n) is the minimal k such that Fibonacci(k) &lt;= n (the &quot;upper&quot; Fibonacci Inverse).
public class A130233 extends AbstractSequence {

  private Z mN; // current index
  private final Sequence mSeq;
  private final int mLowerUpper; // 0 for lower, 1 for upper inverse
  private Z[] mRange; // seq(k), seq(k + 1)
  private long mK; // the result
  private boolean mInit0; // whether to emit a leading zero

  /** Construct the sequence. */
  public A130233() {
    this(0, new A000045(), 0, false);
  }

  /**
   * Generic constructor with parameters
   * @param offset first offset
   * @param seq underlying sequence
   * @param lowewrUpper 0 for lower, 1 for upper inverse
   * @param init0 whether to emit a leading zero
   */
  public A130233(final int offset, final Sequence seq, final int lowerUpper, final boolean init0) {
    super(offset);
    mSeq = seq;
    mN = Z.valueOf(offset - 1);
    mLowerUpper = lowerUpper;
    mInit0 = init0;
    mK = mSeq.getOffset();
    mRange = new Z[2];
    mRange[0] = mSeq.next();
    mRange[1] = mSeq.next();
  }

  @Override
  public Z next() {
    if (mInit0) {
      mInit0 = false;
      return Z.ZERO;
    }
    mN = mN.add(1);
    if (mLowerUpper == 0) {
      while (mRange[1].compareTo(mN) <= 0) {
        ++mK;
        mRange[0] = mRange[1];
        mRange[1] = mSeq.next();
      }
      return Z.valueOf(mK);
    } else {
      while (mRange[0].compareTo(mN) <= 0) {
        ++mK;
        mRange[0] = mRange[1];
        mRange[1] = mSeq.next();
      }
      return Z.valueOf(mK);
    }
  }
}
