package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053458 Open disk numbers (version 3): a(n)= number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in a open disk of diameter n, centered at (0,0).
 * @author Sean A. Irvine
 */
public class A053458 implements Sequence {

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
