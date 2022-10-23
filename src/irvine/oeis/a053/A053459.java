package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053459 Open disk numbers (version 4): a(n) is the number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in an open disk of diameter n, centered at (1/2,0).
 * @author Sean A. Irvine
 */
public class A053459 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long i = -mN - 1; i <= mN + 3; ++i) {
      final CR df = CR.valueOf(Math.abs(4 * mN * mN + 6 * i - 3 * i * i - 3)).sqrt();
      final long j1 = ((1 - 2 * i) - df.floor().longValueExact()) / 4;
      final long j2 = ((1 - 2 * i) + df.ceil().longValueExact()) / 4;
      for (long j = j1; j <= j2; ++j) {
        if (4 * i * i - 4 * i - 2 * j + 4 * i * j + 4 * j * j + 1 < mN * mN) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
