package irvine.math.z;

import java.util.Iterator;

import irvine.math.LongUtils;
import irvine.util.string.StringUtils;

/**
 * An iterator for all decimal palindromes with a given prefix.
 * @author Sean A. Irvine
 */
public final class PrefixedPalindromes implements Iterator<Z> {

  private final String mPrefix;
  private final int mK;

  private int mLength;
  private long mCounter;
  private long mLimit;
  private boolean mEmitPrefix;

  private static String reverse(final String s) {
    return new StringBuilder(s).reverse().toString();
  }

  /**
   * Construct a palindrome iterator for a given prefix.
   * @param prefix the prefix
   */
  public PrefixedPalindromes(final String prefix) {
    mPrefix = prefix;
    mEmitPrefix = StringUtils.isPalindrome(prefix);
    mK = prefix.length();
    mLength = mK;
    reset();
  }

  /**
   * Construct a palindrome iterator for a given prefix.
   * @param prefix the prefix
   */
  public PrefixedPalindromes(final long prefix) {
    this(String.valueOf(prefix));
  }

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Z next() {
    // prefix itself
    if (mEmitPrefix) {
      mEmitPrefix = false;
      return new Z(mPrefix);
    }
    final String left = buildLeft();
    final String pal = (mLength & 1) == 0 ? left + reverse(left) : left + reverse(left.substring(0, left.length() - 1));
    ++mCounter;
    if (mCounter == mLimit) {
      ++mLength;
      reset();
    }
    return new Z(pal);
  }

  private void reset() {
    final int leftLen = (mLength + 1) / 2;
    final int free = leftLen - mK;
    if (free < 0) {
      ++mLength;
      reset();
      return;
    }
    mLimit = LongUtils.pow(10, free);
    mCounter = 0;
  }

  private String buildLeft() {
    final int leftLen = (mLength + 1) / 2;
    final int free = leftLen - mK;
    if (free == 0) {
      return mPrefix;
    }
    return mPrefix + String.format("%0" + free + "d", mCounter);
  }

}
