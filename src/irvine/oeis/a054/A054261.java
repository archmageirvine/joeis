package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A054261 Smallest number that contains the first n primes as substrings.
 * @author Sean A. Irvine
 */
public class A054261 extends A054260 {

  @Override
  protected void pack(final StringBuilder s, final int remaining, final boolean[] used) {
    //System.out.println(s + " " + remaining + " " + Arrays.toString(used));
    final int slen = s.length();
    if (slen > mBestLength) {
      return; // cannot beat existing solution
    }
    if (remaining == 0) {
      final Z t = new Z(s);
        if (mBest == null || t.compareTo(mBest) < 0) {
          mBest = t;
          mBestLength = s.length();
          if (mVerbose) {
            StringUtils.message("Best is now: " + mBest + " (no extra digits were required)");
          }
        }
      return;
    }
    for (int k = 0; k < mRequired.size(); ++k) {
      if (!used[k]) {
        final String word = mRequired.get(k);
        if (s.indexOf(word) >= 0) {
          // Entire word is already contained in string we are building
          used[k] = true;
          pack(s, remaining - 1, used);
          used[k] = false;
        } else {
          // Find longest prefix of word already at end of s
          int j = word.length();
          while (!endsWith(s, word, j)) {
            --j;
          }
          used[k] = true;
          final int len = s.length();
          s.append(word.substring(j));
          pack(s, remaining - 1, used);
          s.delete(len, s.length());
          used[k] = false;
        }
      }
    }
  }
}

