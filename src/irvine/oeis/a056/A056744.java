package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056744 a(n) is the smallest number which when written in binary contains as substrings the binary expansions of 1..n.
 * @author Sean A. Irvine
 */
public class A056744 implements Sequence {

  private int mN = 0;
  private int mBestLength = 0;
  private Z mBest = null;
  private String[] mStrings = null;

  private boolean isMatch(final StringBuilder s, final String bin, final int j) {
    if (j > s.length()) {
      return false;
    }
    for (int k = 0, i = s.length() - j; k < j; ++k, ++i) {
      if (s.charAt(i) != bin.charAt(k)) {
        return false;
      }
    }
    return true;
  }

  private String[] buildStrings(final int n) {
    // Ignores any redundant strings that are contained in a larger value
    final ArrayList<String> strs = new ArrayList<>();
    for (int k = n; k > 0; --k) {
      final String t = Integer.toBinaryString(k);
      boolean include = true;
      for (final String s : strs) {
        if (s.contains(t)) {
          include = false;
          break;
        }
      }
      if (include) {
        strs.add(t);
      }
    }
    return strs.toArray(new String[0]);
  }

  private void search(final StringBuilder s, final boolean[] used, final int remaining) {
    if (remaining == 0) {
      final Z t = new Z(s, 2);
      if (mBest == null || t.compareTo(mBest) < 0) {
        mBestLength = s.length();
        mBest = t;
      }
      return;
    }
    if (s.length() > mBestLength) {
      return;
    }
    for (int k = 0; k < mStrings.length; ++k) {
      if (!used[k]) {
        used[k] = true;
        final String bin = mStrings[k];
        if (s.indexOf(bin) >= 0) {
          search(s, used, remaining - 1);
        } else {
          final int v = s.length();
          for (int j = bin.length() - 1; j > 0; --j) {
            if (isMatch(s, bin, j)) {
              s.append(bin.substring(j));
              search(s, used, remaining - 1);
              s.setLength(v);
            }
          }
          s.append(bin);
          search(s, used, remaining - 1);
          s.setLength(v);
        }
        used[k] = false;
      }
    }
  }

  @Override
  public Z next() {
    mStrings = buildStrings(++mN);
    mBestLength = Integer.MAX_VALUE;
    mBest = null;
    search(new StringBuilder(), new boolean[mStrings.length], mStrings.length);
    return mBest;
  }

}
