package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A391189 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A391189 extends Sequence1 {

  private int mN = 0;
  private long mMin = 2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private void search(final String n, final long prev, final int remaining) {
    if (remaining == 0) {
      final Z t = new Z(n);
      if (Predicates.SQUARE.is(t)) {
        if (mVerbose) {
          StringUtils.message(mN + " new minimum " + prev);
        }
        mMin = prev;
      }
      return;
    }
    long k = prev;
    while (true) {
      final long sq = ++k * k;
      final String sqs = String.valueOf(sq);
      if (k + remaining > mMin) {
        return;
      }
      search(n + sqs, k, remaining - 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mMin *= 3; // increase allowed maximum, this factor works well for known terms
      final long lim = mMin;
      if (mVerbose) {
        StringUtils.message(mN + " searching with upper limit " + lim);
      }
      search("", 0, mN);
      if (mMin != lim) {
        return Z.valueOf(mMin);
      }
    }
  }
}
