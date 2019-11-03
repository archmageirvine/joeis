package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027429 Number of distinct products ijk with <code>0 &lt;= i &lt; j &lt; k &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A027429 implements Sequence {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      final long t = k * mN;
      for (long j = k + 1; j < mN; ++j) {
        mSeen.add(t * j);
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
