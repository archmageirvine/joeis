package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000161 Number of partitions of n into 2 squares.
 * @author Sean A. Irvine
 */
public class A000161 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    final long lim = Functions.SQRT.l(mN >>> 1);
    for (long k = 0; k <= lim; ++k) {
      final long v = mN - k * k;
      final long u = Functions.SQRT.l(v);
      if (u * u == v) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
