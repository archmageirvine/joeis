package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A053600 a(1) = 2; for n&gt;=1, a(n+1) is the smallest palindromic prime with a(n) as a central substring.
 * @author Georg Fischer
 */
public class A053600 implements SequenceWithOffset {

  private int mOffset;
  private final String mSeed;
  private StringBuilder mA = null;


  /** Construct the sequence. */
  public A053600() {
    this(1, "2");
  }

  /**
   * Generic constructor with parameters
   * @param seed initial center of the palindrome
   */
  public A053600(final int offset, final String seed) {
    mOffset = offset;
    mSeed = seed;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder(mSeed);
      final Z a = new Z(mA);
      if (mSeed.length() == 1 || mSeed.charAt(0) != '0') {
        return a;
      }
    }
    long k = 0;
    while (true) {
      final StringBuilder rev = new StringBuilder().append(++k).reverse();
      if ((rev.charAt(rev.length() - 1) & 1) == 1) {
        final StringBuilder t = new StringBuilder().append(k).append(mA).append(rev);
        final Z a = new Z(t);
        if (a.isProbablePrime()) {
          mA = t;
          return a;
        }
      }
    }
  }
}
