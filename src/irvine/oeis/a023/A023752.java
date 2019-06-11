package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023752 Plaindromes: numbers whose digits in base 11 are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A023752 implements Sequence {

  private long mN = -1;

  private boolean is(long m) {
    long t = 11;
    while (m != 0) {
      final long u = m % 11;
      m /= 11;
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

