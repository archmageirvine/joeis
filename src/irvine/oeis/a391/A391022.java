package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A391022 Minimal square obtained by concatenating n distinct nonzero squares in ascending order.
 * @author Sean A. Irvine
 */
public class A391022 extends Sequence1 {

  private int mN = 0;
  private int mMaxLength = 1;
  private String mMin = null;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean lt(final String s, final String t) {
    if (t == null) {
      return true;
    }
    final int c = Integer.compare(s.length(), t.length());
    if (c < 0) {
      return true;
    }
    if (c > 0) {
      return false;
    }
    return s.compareTo(t) < 0;
  }

  private void search(final String n, final long prev, final int remaining) {
    if (remaining == 0) {
      final Z t = new Z(n);
      if (Predicates.SQUARE.is(t)) {
        if (mVerbose) {
          StringUtils.message(mN + " new minimum " + t);
        }
        mMin = n;
      }
      return;
    }
    long k = prev;
    while (true) {
      final long sq = ++k * k;
      final String sqs = String.valueOf(sq);
      final int len = n.length() + sqs.length() * remaining;
      if (len > mMaxLength) {
        return;
      }
      if (mMin != null) {
        if (len > mMin.length()) {
          return;
        }
        final String check = n + sqs.repeat(remaining);
        if (!lt(check, mMin)) {
          return;
        }
      }
      search(n + sqs, k, remaining - 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMin = null;
    search("", 0, mN);
    if (mMin == null) {
      throw new RuntimeException("Length bound " + mMaxLength + " was insufficient");
    }
    mMaxLength = Math.min(2 * mMin.length(), mMin.length() + 8); // set a length limit for the next term
    return new Z(mMin);
  }
}
