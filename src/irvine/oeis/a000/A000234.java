package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000234 Partitions into non-integral powers (see Comments for precise definition).
 * @author Sean A. Irvine
 */
public class A000234 extends Sequence1 {

  private static final double THIRD = 1.0 / 3.0;

  private long mN = 0;

  private long count(final long i, final double m, final long k) {
    if (k == 1) {
      return 1;
    }
    int c = 0;
    final long l = (long) Math.sqrt(m * m * m);
    final long lim = Math.min(l, i);
    for (long j = 1; j <= lim; ++j) {
      final double m2 = m - Math.pow(j * j, THIRD);
      if (m2 >= 1) {
        c += count(j, m2, k - 1);
      }
      ++c;
    }
    return c;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(count(Functions.SQRT.l(mN * mN * mN), mN, mN));
  }
}
