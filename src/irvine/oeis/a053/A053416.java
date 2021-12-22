package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053413.
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
