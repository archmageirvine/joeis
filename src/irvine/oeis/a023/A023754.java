package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023754.
 * @author Sean A. Irvine
 */
public class A023754 implements Sequence {

  private long mN = -1;

  private boolean is(long m) {
    long t = 13;
    while (m != 0) {
      final long u = m % 13;
      m /= 13;
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

