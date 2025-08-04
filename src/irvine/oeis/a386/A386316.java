package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386316 allocated for Ben Orlin.
 * @author Sean A. Irvine
 */
public class A386316 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FOUR;
    }
    long min = 3 * (mN + 2);
    for (long x = 1; x * x <= mN; ++x) {
      final long y = (mN + x - 1) / x;
      final long a = (x + 2) * (y + 2);
      if (a < min) {
        min = a;
      }
    }
    return Z.valueOf(min);
  }
}
