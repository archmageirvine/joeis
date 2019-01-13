package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000161.
 * @author Sean A. Irvine
 */
public class A000161 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    final long lim = LongUtils.sqrt(mN >>> 1);
    for (long k = 0; k <= lim; ++k) {
      final long v = mN - k * k;
      final long u = LongUtils.sqrt(v);
      if (u * u == v) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
