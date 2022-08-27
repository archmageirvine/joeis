package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A023055 (Apparently) differences between adjacent perfect powers (integers of form a^b, a &gt;= 1, b &gt;= 2).
 * @author Sean A. Irvine
 */
public class A023055 extends A001597 {

  // WARNING: Heuristic, do not use this to extend sequence

  private static final int HEURISTIC_SIZE = 10000;
  private final TreeSet<Z> mDone = new TreeSet<>();
  private final TreeSet<Z> mDifferences = new TreeSet<>();
  private Z mA = super.next();

  @Override
  public Z next() {
    while (mDifferences.size() < HEURISTIC_SIZE * (mDone.size() + 1)) {
      final Z b = super.next();
      final Z d = b.subtract(mA);
      if (!mDone.contains(d)) {
        if (!mDone.isEmpty() && d.compareTo(mDone.last()) < 0) {
          throw new UnsupportedOperationException("Heuristic failure detected: " + d + " should have been output earlier");
        }
        mDifferences.add(d);
      }
      mA = b;
    }
    final Z res = mDifferences.pollFirst();
    mDone.add(res);
    return res;
  }
}
