package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027422 Triangle <code>T00, T10, T11, T20, T21, T22</code>, etc. where Tmn = number of distinct products <code>ij</code> with <code>m-n&lt;=i,j&lt;=m</code>.
 * @author Sean A. Irvine
 */
public class A027422 implements Sequence {

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
    final int min = mN - mM;
    final TreeSet<Long> seen = mSeen.get(min);
    for (long k = min; k <= mN; ++k) {
      seen.add(k * mN);
    }
    return Z.valueOf(seen.size());
  }
}
