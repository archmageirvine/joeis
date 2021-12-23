package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053414 Circle numbers (version 2): a(n) is the number of points (i,j), i,j integers, contained in a circle of diameter n, centered at (0, 1/2).
 * @author Sean A. Irvine
 */
public class A053414 implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover

  private long mN = -1;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2;
    long sum = 0;
    for (long i = -m; i <= m; ++i) {
      final long c = CR.valueOf(m * m - i * i).sqrt().ceil().longValueExact();
      for (long j = -c; j <= c; ++j) {
        if (mN > 2 * i && 2 * i + mN > 0 && mN * mN - 4 * i * i + 4 * j - 4 * j * j - 1 >= 0) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
