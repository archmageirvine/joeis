package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002810 Smallest number containing n syllables in UK English.
 * @author Sean A. Irvine
 */
public class A002810 extends Sequence1 {

  // After M. F. Hasler

  private static final long[] SMALL = {0, 1, 7, 11, 27, 77, 107, 111, 127, 177, 777, 1127, 1177};
  private int mN = 0;

  private Z a(final long n) {
    if (n > 58) {
      throw new UnsupportedOperationException();
    }
    if (n < SMALL.length) {
      return Z.valueOf(SMALL[(int) n]);
    }
    return a(n - 12).multiply(1000).add(777);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

