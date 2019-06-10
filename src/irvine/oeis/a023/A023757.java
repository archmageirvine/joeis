package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023757.
 * @author Sean A. Irvine
 */
public class A023757 implements Sequence {

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

