package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053416 Circle numbers (version 4): a(n)= number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in a circle of diameter n, centered at (0,0).
 * @author Sean A. Irvine
 */
public class A053416 implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover

  private long mN = -1;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2 + 3;
    long sum = 0;
    for (long i = -m; i <= m; ++i) {
      for (long j = -m; j <= m; ++j) {
        if (4 * (i * i + i * j + j * j) <= mN * mN) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
