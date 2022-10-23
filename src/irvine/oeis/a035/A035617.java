package irvine.oeis.a035;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A035617 Number of winning length n strings with a 3-symbol alphabet in "same game".
 * @author Sean A. Irvine
 */
public class A035617 extends Sequence0 {

  private final List<LongDynamicBooleanArray> mWinning = new ArrayList<>();
  private long mLimit = 1;

  private boolean isWinning(final String s) {
    // Ignore the leading digit, it is only present to allow for leading 0s
    // Look up deletion of each repeat of length >= 2
    for (int j = 1; j < s.length() - 1; ++j) {
      final char c = s.charAt(j);
      if (s.charAt(j + 1) == c) {
        int i = j + 2;
        while (i < s.length() && s.charAt(i) == c) {
          ++i;
        }
        final String u = s.substring(1, j) + s.substring(i);
        if (u.isEmpty()) {
          return true;
        }
        final long v = Long.parseLong(u, 3);
        if (mWinning.get(mWinning.size() - i + j - 1).isSet(v)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mWinning.isEmpty()) {
      final LongDynamicBooleanArray w = new LongDynamicBooleanArray();
      w.set(0);
      mWinning.add(w);
      return Z.ONE;
    }
    long cnt = 0;
    final LongDynamicBooleanArray w = new LongDynamicBooleanArray();
    mWinning.add(w);
    mLimit *= 3;
    for (long k = mLimit; k < 2 * mLimit; ++k) {
      // Search from mLimit..2*mLimit rather than 0..mLimit to avoid leading 0s
      final String s = Long.toString(k, 3);
      if (isWinning(s)) {
        w.set(k - mLimit);
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

