package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023757 Plaindromes: numbers whose digits in base 16 are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A023757 extends Sequence1 {

  private long mN = -1;

  private boolean is(long m) {
    long t = 16;
    while (m != 0) {
      final long u = m % 16;
      m /= 16;
      if (u > t) {
        return false;
      }
      t = u;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

