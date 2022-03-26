package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053595 Open 3-dimensional ball numbers (version 3): a(n) is the number of integer points (i,j,k) contained in an open ball of diameter n, centered at (1/2,1/2,0).
 * @author Sean A. Irvine
 */
public class A053595 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2;
    long sum = 0;
      for (long i = -m; i <= m; ++i) {
        final long u = m * m - i * i;
        if (u >= 0) {
          final long c = CR.valueOf(u).sqrt().ceil().longValueExact();
          for (long j = -c; j <= c; ++j) {
            for (long k = -c; k <= c; ++k) {
            if (mN > 2 * i && 2 * i + mN > 0 && mN * mN - 4 * i * i + 4 * k + 4 * j - 4 * j * j - 4 * k * k - 1 > 0) {
              ++sum;
            }
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
