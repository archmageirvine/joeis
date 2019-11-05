package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027420 Triangle <code>T00, T10, T01, T20, T11, T02</code>, etc., where <code>Tmn =</code> number of distinct products <code>ij</code> with <code>min(m,n) &lt;=</code> i,j <code>&lt;= max(m,n)</code>.
 * @author Sean A. Irvine
 */
public class A027420 implements Sequence {

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
