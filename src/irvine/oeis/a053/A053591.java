package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053591 Closed 3-dimensional ball numbers (version 1): a(n)= number of integer points (i,j,k) contained in a closed ball of diameter n, centered at (0,0,0).
 * @author Sean A. Irvine
 */
public class A053591 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2;
    final long m2 = (mN * mN + 2) / 4;
    long sum = 0;
    for (long i = 0; i <= m; ++i) {
      final long u = i == 0 ? 1 : 2;
      for (long j = 0; j <= m; ++j) {
        final long t = j == 0 ? u : 2 * u;
        for (long k = 0; k <= m; ++k) {
          if (i * i + j * j + k * k <= m2) {
            sum += k == 0 ? t : 2 * t;
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
