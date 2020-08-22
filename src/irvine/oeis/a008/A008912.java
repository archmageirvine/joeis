package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A008912 Truncated triangular numbers (of form n*(n-3)/2 - k^2+k*n+1 for 1&lt;=k&lt;n).
 * @author Sean A. Irvine
 */
public class A008912 extends A008867 {

  private Z mPrev = Z.ZERO;
  private int mLookahead = 0; // Heuristic lookahead
  private final TreeSet<Z> mSet = new TreeSet<>();

  @Override
  public Z next() {
    ++mLookahead;
    while (mSet.size() < mLookahead) {
      final Z t = super.next();
      if (t.compareTo(mPrev) > 0) {
        mSet.add(t);
      }
    }
    mPrev = mSet.pollFirst();
    return mPrev;
  }
}

