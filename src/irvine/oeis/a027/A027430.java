package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027430 Number of distinct products <code>ijk</code> with <code>1 &lt;=</code> i&lt;j&lt;k <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A027430 implements Sequence {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      final long t = k * mN;
      for (long j = k + 1; j < mN; ++j) {
        mSeen.add(t * j);
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
