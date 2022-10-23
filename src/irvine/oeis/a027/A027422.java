package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027422 Triangle T00, T10, T11, T20, T21, T22, etc. where Tmn = number of distinct products ij with m-n&lt;=i,j&lt;=m.
 * @author Sean A. Irvine
 */
public class A027422 extends Sequence0 {

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
