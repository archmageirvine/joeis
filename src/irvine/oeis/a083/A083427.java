package irvine.oeis.a083;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A083427 Smallest prime which is a concatenation of n distinct primes.
 * @author Sean A. Irvine
 */
public class A083427 extends Sequence1 {

  // See https://oeis.org/A083427/a083427.py.txt for a better solution

  // In particular, this could do with better handling of single digit primes that (likely) occur in all later terms

  private int mN = 0;
  private final List<String> mPrimes = new ArrayList<>();
  private long mP = 2;
  private String mMin = null;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean isMin(final String s) {
    return mMin == null || s.length() < mMin.length() || (s.length() == mMin.length() && s.compareTo(mMin) < 0);
  }

  private void search(final String s, final int n, final boolean[] used) {
    if (n == mN) {
      if (new Z(s).isProbablePrime()) {
        mMin = s;
        if (mVerbose) {
          StringUtils.message("New best for " + mN + " primes is " + mMin);
        }
      }
      return;
    }
    for (int k = 0; k < mPrimes.size(); ++k) {
      if (!used[k]) {
        final String t = s + mPrimes.get(k);
        if (isMin(t)) {
          used[k] = true;
          search(t, n + 1, used);
          used[k] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      while (mP < 10) {
        mPrimes.add(String.valueOf(mP));
        mP = Functions.NEXT_PRIME.l(mP);
      }
    } else if (mN == 5) {
      while (mP < 100) {
        mPrimes.add(String.valueOf(mP));
        mP = Functions.NEXT_PRIME.l(mP);
      }
      Collections.sort(mPrimes); // lex
    }
    mMin = null;
    search("", 0, new boolean[mPrimes.size()]);
    return new Z(mMin);
  }

}
