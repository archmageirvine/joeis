package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027421 Triangle T(n,k) = number of distinct products ij with k&lt;=i,j&lt;=n, for 0&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A027421 extends Sequence0 {

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
    final TreeSet<Long> seen = mSeen.get(mM);
    for (long k = mM; k <= mN; ++k) {
      seen.add(k * mN);
    }
    return Z.valueOf(seen.size());
  }
}
