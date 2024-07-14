package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A053600 a(1) = 2; for n&gt;=1, a(n+1) is the smallest palindromic prime with a(n) as a central substring.
 * @author Georg Fischer
 */
public class A053600 extends AbstractSequence {

  private final String mSeed;
  private final int mBase;
  private StringBuilder mA = null;


  /** Construct the sequence. */
  public A053600() {
    this(1, "2");
  }

  /**
   * Generic constructor with 2 parameters
   * @param seed initial center of the palindrome
   */
  public A053600(final int offset, final String seed) {
    super(offset);
    mSeed = seed;
    mBase = 10;
  }

  /**
   * Generic constructor with 3 parameters
   * @param seed initial center of the palindrome
   * @param base number base
   */
  public A053600(final int offset, final String seed, final int base) {
    super(offset);
    mSeed = seed;
    mBase = base;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder(mSeed);
      final Z a = new Z(mA, mBase);
      if (mSeed.length() == 1 || mSeed.charAt(0) != '0') {
        return a;
      }
    }
    long k = 0;
    while (true) {
      final String ks = Long.toString(++k, mBase);
      final StringBuilder rev = new StringBuilder().append(ks).reverse();
      if ((rev.charAt(rev.length() - 1) & 1) == 1 || (mBase & 1) == 1) {
        final StringBuilder t = new StringBuilder().append(ks).append(mA).append(rev);
        final Z a = new Z(t, mBase);
        if (a.isProbablePrime()) {
          mA = t;
          return new Z(t, 10);
        }
      }
    }
  }
}
