package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027420 Triangle T00, T10, T01, T20, T11, T02, etc., where Tmn = number of distinct products ij with min(m,n) &lt;= i,j &lt;= max(m,n).
 * @author Sean A. Irvine
 */
public class A027420 extends Sequence0 {

  private final ArrayList<TreeSet<Long>> mSeen = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mSeen.add(new TreeSet<>());
    }
    final int min = Math.min(mM, mN - mM);
    final int max = Math.max(mM, mN - mM);
    final TreeSet<Long> seen = mSeen.get(min);
    for (long k = min; k <= max; ++k) {
      seen.add(k * max);
    }
    return Z.valueOf(seen.size());
  }
}
