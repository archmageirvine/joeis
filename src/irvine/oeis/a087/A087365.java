package irvine.oeis.a087;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A087365 Smallest palindrome divisible by n^n, or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A087365 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Z mMod;
  private Z[] mWeight;
  private HashMap<Z, byte[]> mRight;
  private char[] mLeft;
  private int mLeftLen;
  private int mRightLen;
  private byte[] mFound;

  private byte[] mDigits = new byte[mRightLen];

  private void buildRight(final int pos, final Z sum) {
    if (pos == mLeftLen + mRightLen) {
      mRight.putIfAbsent(sum, mDigits.clone());
      return;
    }
    for (int d = 0; d < 10; ++d) {
      mDigits[pos - mLeftLen] = (byte) d;
      final Z s = sum.add(mWeight[pos].multiply(Z.valueOf(d))).mod(mMod);
      buildRight(pos + 1, s);
    }
  }

  private boolean searchLeft(final int pos, final Z sum) {
    if (pos == mLeftLen) {
      final Z target = mMod.subtract(sum).mod(mMod);
      final byte[] v = mRight.get(target);
      if (v != null) {
        mFound = v;
        return true;
      }
      return false;
    }
    if (pos == 0 && mN % 5 == 0) {
      // The only possible first digit is 5
      mLeft[pos] = '5';
      final Z s = sum.add(mWeight[pos].multiply(5)).mod(mMod);
      return searchLeft(pos + 1, s);
    } else {
      // Even mN must start with an even digit
      final int inc = pos == 0 && (mN & 1) == 0 ? 2 : 1;
      final int start = pos == 0 ? inc : 0;
      for (int d = start; d < 10; d += inc) {
        mLeft[pos] = (char) ('0' + d);
        final Z s = sum.add(mWeight[pos].multiply(Z.valueOf(d))).mod(mMod);
        if (searchLeft(pos + 1, s)) {
          return true;
        }
      }
    }
    return false;
  }

  private Z makePalindrome(final String first, final int len) {
    final StringBuilder sb = new StringBuilder(first);
    for (int k = (len & 1) == 0 ? first.length() - 1 : first.length() - 2; k >= 0; --k) {
      sb.append(first.charAt(k));
    }
    Z result = Z.ZERO;
    for (int k = 0; k < sb.length(); ++k) {
      result = result.multiply(Z.TEN).add(Z.valueOf(sb.charAt(k) - '0'));
    }
    return result;
  }

  private Z search(final int len) {
    final int h = (len + 1) / 2;
    mLeftLen = (h + 1) / 2;
    mRightLen = h - mLeftLen;
    mDigits = new byte[mRightLen];

    // Powers of 10 modulo n^n.
    final Z[] pow = new Z[len];
    pow[0] = Z.ONE;
    for (int k = 1; k < len; ++k) {
      pow[k] = pow[k - 1].multiply(Z.TEN).mod(mMod);
    }

    // Coefficient of each independent palindrome digit.
    mWeight = new Z[h];
    for (int k = 0; k < h; ++k) {
      mWeight[k] = k == len - 1 - k ? pow[k] : pow[k].add(pow[len - 1 - k]).mod(mMod);
    }
    mRight = new HashMap<>();
    mLeft = new char[mLeftLen];

    // Enumerate right halves, retaining the smallest for each residue.
    buildRight(mLeftLen, Z.ZERO);

    // Search left halves in increasing numerical order.
    if (searchLeft(0, Z.ZERO)) {
      final StringBuilder first = new StringBuilder(new String(mLeft));
      for (final byte d : mFound) {
        first.append((char) ('0' + d));
      }
      return makePalindrome(first.toString(), len);
    }
    return null;
  }

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    // Compute n^n exactly
    mMod = Z.valueOf(mN).pow(mN);
    // Increase palindrome length until a solution is found
    int len = 0;
    while (true) {
      ++len;
      if (mVerbose) {
        StringUtils.message(mN + " starting search of length " + len);
      }
      final Z result = search(len);
      if (result != null) {
        return result;
      }
    }
  }
}
