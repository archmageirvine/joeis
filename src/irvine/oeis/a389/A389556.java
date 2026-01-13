package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389556 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A389556 extends Sequence1 {

  private long mCount = 0;
  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    for (long y = 1; 2 * y < mN; ++y) {
      final long x = mN - y;
      if (Functions.GCD.l(y, x) == 1 && 2 * x * y > x * x - y * y) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}

