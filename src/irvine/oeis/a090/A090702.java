package irvine.oeis.a090;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.CollectionUtils;
import irvine.util.array.LongDynamicByteArray;

/**
 * A090702 a(n) is the minimal number k such that every binary word of length n can be transformed into a palindrome or an antipalindrome by deleting at most k letters.
 * @author Sean A. Irvine
 */
public class A090702 implements Sequence {

  // We are dealing with words, so need to support leading 0's
  // This is done by assuming a leading 1 which is ignored for palindrome and antipalindrome testing

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = 1;
  private long mLim = 2;

  private static boolean isPalindromeOrAntipalindrome(final long n) {
    final ArrayList<Long> digits = new ArrayList<>();
    long t = n;
    while (t > 1) {
      digits.add(t & 1);
      t >>>= 1;
    }
    return CollectionUtils.isAntipalindrome(digits) || CollectionUtils.isPalindrome(digits);
  }

  @Override
  public Z next() {
    mLim = 2 * mLim;
    int max = 0;
    while (mN < mLim) {
      if (isPalindromeOrAntipalindrome(mN)) {
        mA.set(mN, (byte) 0);
      } else {
        int min = Integer.MAX_VALUE;
        for (long k = 1; k < mN; k <<= 1) {
          final long lo = k - 1;
          final long hi = ~lo - k;
          final long l = mN & lo;
          final long h = mN & hi;
          final int d = mA.get((h >>> 1) + l);
          if (d < min) {
            min = d;
          }
        }
        ++min;
        mA.set(mN, (byte) min);
        if (min > max) {
          max = min;
        }
      }
      ++mN;
    }
    return Z.valueOf(max);
  }
}
