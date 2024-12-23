package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073901 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  private void search(final Z n, final long remaining) {
    if (remaining == 0) {
      if (n.isProbablePrime()) {
        ++mCount;
      }
      return;
    }
    final Z t = n.multiply(10);
    for (long k = 1; k <= Math.min(remaining, 9); ++k) {
      search(t.add(k), remaining - k);
    }
  }

  @Override
  public Z next() {
    if (++mN > 3 && mN % 3 == 0) {
      return Z.ZERO;
    }
    mCount = 0;
    search(Z.ZERO, mN);
    return Z.valueOf(mCount);
  }
}

