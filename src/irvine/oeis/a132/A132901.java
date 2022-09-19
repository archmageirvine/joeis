package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000040;

/**
 * A132901 Numbers formed by concatenating 11 consecutive prime numbers.
 * @author Georg Fischer
 */
public class A132901 extends A000040 implements SequenceWithOffset {

  private int mN;
  private final int mCount;
  protected int mOffset;
  private int[] mLengths; // ring buffer
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A132901() {
    this(1, 11);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param count number of primes to be concatenated
   */
  public A132901(final int offset, final int count) {
    mOffset = offset;
    mN = -1; // != offset, -> mN mod count = index in ring buffer mLengths
    mCount = count;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) { // configure
      mSb.append("1"); // to be removed for first term
      mLengths = new int[mCount];
      mLengths[0] = mSb.length();
      for (int i = 1; i < mCount; ++i) {
        final String primeStr = super.next().toString();
        mLengths[i] = primeStr.length();
        mSb.append(primeStr);
      }
      // configured: 1 and 10 primes concatenated
    }
    final int i = mN % mCount;
    mSb.delete(0, mLengths[i]);
    final String primeStr = super.next().toString();
    mLengths[i] = primeStr.length();
    mSb.append(primeStr);
    return new Z(mSb.toString());
  }
}
