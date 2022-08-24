package irvine.oeis.a204;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A204581 Nearest integer to 100*1.01^n.
 * @author Georg Fischer
 */
public class A204581 implements SequenceWithOffset {

  private final int mOffset;
  private final Z mParm;
  private Q mPow;
  private static final Q HUNDRED = new Q(100);

  /** Construct the sequence. */
  public A204581() {
    this(0, 101);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm numerator * 100
   */
  public A204581(final int offset, final int parm) {
    mOffset = offset;
    mParm = Z.valueOf(parm);
    mPow = Q.ONE;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    final Z result = mPow.multiply(100).round();
    mPow = mPow.multiply(mParm).divide(HUNDRED);
    return result;
  }
}
