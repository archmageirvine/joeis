package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027421 Triangle <code>T(n,k) =</code> number of distinct products <code>ij</code> with <code>k&lt;=i,j&lt;=n</code>, for <code>0&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A027421 implements Sequence {

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
