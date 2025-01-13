package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074135 Triangle read by rows: for 1 &lt;= k &lt; n, a(n, k) is the least positive integer not already used. a(n, n) is the least positive integer not already used that makes the row sum a multiple of n.
 * @author Sean A. Irvine
 */
public class A074135 extends Sequence1 {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 1;
  private long mN = 1;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM >= mN) {
      // Complete the row
      long k = mLeastUnused;
      while (true) {
        if (mSum.add(k).mod(mN) == 0 && mUsed.add(k)) {
          ++mN;
          mM = 0;
          mSum = Z.ZERO;
          return Z.valueOf(k);
        }
        ++k;
      }
    }
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    mSum = mSum.add(mLeastUnused);
    return Z.valueOf(mLeastUnused++);
  }
}
