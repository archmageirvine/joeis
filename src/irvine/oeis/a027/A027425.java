package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027425 Number of distinct products ijk with 1 &lt;= i,j,k &lt;= n.
 * @author Sean A. Irvine
 */
public class A027425 extends Sequence1 {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      final long t = k * mN;
      for (long j = k; j <= mN; ++j) {
        mSeen.add(t * j);
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
