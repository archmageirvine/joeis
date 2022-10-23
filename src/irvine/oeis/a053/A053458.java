package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053458 Open disk numbers (version 3): a(n) is the number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in an open disk of diameter n, centered at (0,0).
 * @author Sean A. Irvine
 */
public class A053458 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2 + 3;
    long sum = 0;
    for (long i = -m; i <= m; ++i) {
      for (long j = -m; j <= m; ++j) {
        if (4 * (i * i + i * j + j * j) < mN * mN) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
