package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a069.A069191;

/**
 * A070223 Square roots of A069191, sorted.
 * @author Sean A. Irvine
 */
public class A070223 extends A069191 {

  private static final int HEURISTIC = 5;
  private final TreeSet<Z> mSort = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    while (mSort.size() < LongUtils.log2(mN) * HEURISTIC) {
      mSort.add(super.next().abs().sqrt());
    }
    final Z res = mSort.pollFirst();
    if (res.compareTo(mPrev) < 0) {
      throw new UnsupportedOperationException("Heuristic failed: " + res + " is a term and should have been output earlier");
    }
    mPrev = res;
    return res;
  }
}

