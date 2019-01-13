package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025426.
 * @author Sean A. Irvine
 */
public class A025426 implements Sequence {

  // After R. J. Mathar

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long a = 0;
    for (long x = 1; ; ++x) {
      if (2 * x * x > mN) {
        return Z.valueOf(a);
      }
      final long v = mN - x * x;
      final long s = LongUtils.sqrt(v);
      if (s * s == v) {
        ++a;
      }
    }
  }
}
