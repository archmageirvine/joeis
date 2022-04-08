package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053416 Circle numbers (version 4): a(n)= number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in a circle of diameter n, centered at (0,0).
 * @author Sean A. Irvine
 */
public class A053416 implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover; "m = ..." corrected by Georg Fischer 2022-04-07

  private long mN = -1;

  @Override
  public Z next() {
    final long m = ++mN;
    long sum = 0;
    final long n2 = mN * mN;
    for (long i = -m; i <= m; ++i) {
      final long i2 = i * i;
      for (long j = -m; j <= m; ++j) {
        if (4 * (i2 + j * (i + j)) <= n2) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
