package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027426 Number of distinct products ijk with 0 &lt;= i,j,k &lt;= n.
 * @author Sean A. Irvine
 */
public class A027426 extends Sequence0 {

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
