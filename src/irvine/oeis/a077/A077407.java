package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A077407 In base <code>3,</code> records for the number of Reverse and Add! steps needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A077407 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected long mN = -1;
  private long mLast = -1;

  private int[] mBufA = new int[4]; // Current result
  private int[] mBufB = new int[4]; // Workspace

  private boolean isPalindrome(final int p) {
    final int g = p / 2;
    for (int k = 0, j = p - 1; k < g; ++k, --j) {
      if (mBufA[k] != mBufA[j]) {
        return false;
      }
    }
    return true;
  }

  private long revAddCount(long n) {
    // Do our own special in place computation base 3 rather than
    // using expensive object creation and Z class.

    // Compute initial buffer.
    int p = 0;
    while (n != 0) {
      mBufA[p++] = (int) (n % 3);
      n /= 3;
    }

    // If at any stage of the addition, there is no carry then we can
    // immediately conclude that a palindrome is reached.
    boolean carryTest = false;

    // Iterate reverse and add steps until a palindrome is reached.
    long c = 0;
    final long lim = 100 * mLast;
    while (true) {
      if (carryTest || isPalindrome(p)) {
        return c;
      }
      // Heuristic condition to skip Lychrel numbers
      if (c > lim) {
        if (mVerbose) {
          System.out.println("Probable Lychrel: " + mN);
        }
        return -1;
      }
      ++c;
      // Base 3 reverse and addition, one digit at a time
      int carry = 0;
      carryTest = true;
      for (int k = 0; k < p; ++k) {
        final int a = mBufA[k] + mBufA[p - 1 - k] + carry;
        if (a >= 3) {
          carry = 1;
          mBufB[k] = a - 3;
          carryTest = false;
        } else {
          carry = 0;
          mBufB[k] = a;
        }
      }
      if (carry > 0) {
        if (p == mBufB.length) {
          // Upscale arrays for longer lengths
          mBufA = new int[2 * p];
          mBufB = Arrays.copyOf(mBufB, 2 * p);
        }
        mBufB[p++] = carry;
      }
      final int[] t = mBufA;
      mBufA = mBufB;
      mBufB = t;
    }
  }

  @Override
  public Z next() {
    long t;
    while ((t = revAddCount(++mN)) <= mLast) {
      // do nothing
    }
    if (mVerbose) {
      System.out.println("Start point: " + mN);
    }
    mLast = t;
    return Z.valueOf(t);
  }
}


