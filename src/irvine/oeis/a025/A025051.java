package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025051 Numbers of the form j*k + k*i + i*j, where i,j,k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A025051 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long i = 1; i <= LongUtils.sqrt(mN / 3); ++i) {
        for (long j = i; 3 * i * j <= mN; ++j) {
          final long u = mN - i * j;
          if (u % (j + i) == 0) {
            final long k = u / (j + i);
            if (k >= j) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
