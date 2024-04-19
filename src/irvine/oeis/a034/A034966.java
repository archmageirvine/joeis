package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034966 Number of different values of i^2 + j^2 + k^2 for i,j,k in [ 0,n ] (or [ -n,n ]).
 * @author Sean A. Irvine
 */
public class A034966 extends Sequence0 {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    for (long j = 0; j <= mN; ++j) {
      final long t = s + j * j;
      for (long i = 0; i <= j; ++i) {
        mSeen.add(t + i * i);
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
