package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027426 Number of distinct products <code>ijk</code> with <code>0 &lt;=</code> i,j,k <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A027426 implements Sequence {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      final long t = k * mN;
      for (long j = k; j <= mN; ++j) {
        mSeen.add(t * j);
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
