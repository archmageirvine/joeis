package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A054260 Smallest prime that contains all of the first n primes as substrings.
 * @author Sean A. Irvine
 */
public class A054260 extends Sequence1 {

  protected final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mP = 1;
  protected List<String> mRequired = new ArrayList<>();
  protected Z mBest = null;
  protected int mBestLength = Integer.MAX_VALUE;

  private static final Comparator<String> COMPARATOR = new Comparator<>() {
    @Override
    public int compare(final String a, final String b) {
      final int c = Integer.compare(b.length(), a.length());
      if (c != 0) {
        return c;
      }
      return a.compareTo(b);
    }
  };

  private boolean check(final String s, final long maxPrime) {
    for (long p = maxPrime; p >= 2; p = mPrime.prevPrime(p)) {
      if (!s.contains(String.valueOf(p))) {
        return false;
      }
    }
    return true;
  }

  // Remove obviously redundant strings from the list
  private static List<String> squeeze(final List<String> lst) {
    final List<String> res = new ArrayList<>();
    outer:
    for (final String a : lst) {
      for (final String b : lst) {
        if (!a.equals(b) && b.contains(a)) {
          continue outer;
        }
      }
      res.add(a);
    }
    return res;
  }

  static boolean endsWith(final StringBuilder s, final String query, final int offset) {
    if (offset > s.length()) {
      return false;
    }
    for (int k = offset, j = 0; k > 0; --k, ++j) {
      if (s.charAt(s.length() - k) != query.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  protected void pack(final StringBuilder s, final int remaining, final boolean[] used) {
    //System.out.println(s + " " + remaining + " " + Arrays.toString(used));
    final int slen = s.length();
    if (slen > mBestLength) {
      return; // cannot beat existing solution
    }
    if (remaining == 0) {
      final Z t = new Z(s);
      if (t.isProbablePrime()) {
        if (mBest == null || t.compareTo(mBest) < 0) {
          mBest = t;
          mBestLength = s.length();
          if (mVerbose) {
            StringUtils.message("Best is now: " + mBest + " (no extra digits were required)");
          }
        }
      } else if (slen < mBestLength) {
        for (int digit = 0; digit < 10; ++digit) {
          for (int k = digit == 0 ? 1 : 0; k <= s.length(); ++k) {
            final String r = s.substring(0, k) + digit + s.substring(k);
            final Z candidate = new Z(r);
            if (mBest == null || candidate.compareTo(mBest) < 0) {
              if (candidate.isProbablePrime() && check(r, mP)) {
                mBest = candidate;
                mBestLength = r.length();
                if (mVerbose) {
                  StringUtils.message("Best is now: " + mBest);
                }
              }
            }
          }
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

  @Override
  public Z next() {
    mBest = null;
    mBestLength = Integer.MAX_VALUE;
    mP = mPrime.nextPrime(mP);
    mRequired.add(String.valueOf(mP));
    mRequired = squeeze(mRequired);
    mRequired.sort(COMPARATOR);
    if (mVerbose) {
      StringUtils.message("Required: " + mRequired);
    }
    pack(new StringBuilder(), mRequired.size(), new boolean[mRequired.size()]);
    return mBest;
  }
}

