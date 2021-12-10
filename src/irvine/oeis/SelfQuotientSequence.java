package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the sequence <code>a(n)</code> of quotients of successive terms 
 * of the underlying sequence <code>b(n)</code>: <code>a(n) = b(n+1)/(mult*b(n))</code>.
 * <code>mult</code> is an optional, constant factor.
 * @author Georg Fischer
 */
public class SelfQuotientSequence implements Sequence {

  protected final Sequence mSeq;
  protected Z mPrev;
  protected long mMult; // a factor before the denominator (default: 1)

  /**
   * Create the quotient sequence of a sequence.
   * The factor is 1.
   * @param seq underlying sequence
   */
  public SelfQuotientSequence(final Sequence seq) {
    this(seq, 1);
  }
  
  /**
   * Create the quotient sequence of a sequence.
   * @param seq underlying sequence
   */
  public SelfQuotientSequence(final Sequence seq, final long mult) {
    mSeq = seq;
    mPrev = seq.next();
    mMult = mult;
  }

  @Override
  public Z next() {
    Z t = mPrev;
    if (mMult != 1) {
      t = t.multiply(mMult);
    }
    mPrev = mSeq.next();
    return mPrev.divide(t);
  }
}
