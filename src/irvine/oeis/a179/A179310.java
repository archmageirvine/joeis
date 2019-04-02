package irvine.oeis.a179;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A179310 The smallest number that has more copies of some digit than all previous terms of the sequence put together.
 * @author Sean A. Irvine
 */
public class A179310 implements Sequence {

  private final int[] mCounts = new int[10];
  private final int[] mWorkspace = new int[10];
  private Z mN = Z.ZERO;
  private int mPrevMin = 0;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString();
      Arrays.fill(mWorkspace, 0);
      for (int k = 0; k < s.length(); ++k) {
        mWorkspace[s.charAt(k) - '0']++;
      }
      boolean ok = false;
      for (int k = 0; k < mCounts.length; ++k) {
        if (mWorkspace[k] > mCounts[k]) {
          ok = true;
          break;
        }
      }
      if (ok) {
        final Z r = mN;
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < mCounts.length; ++k) {
          mCounts[k] += mWorkspace[k];
          min = Math.min(mCounts[k], min);
        }
        if (min > mPrevMin) {
          // For efficiency skip a bunch of numbers that can never meet the target
          final StringBuilder sb = new StringBuilder();
          for (int k = 0; k < min; ++k) {
            sb.append('9');
          }
          mN = new Z(sb);
          mPrevMin = min;
        }
        return r;
      }
    }
  }
}

