package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023756.
 * @author Sean A. Irvine
 */
public class A023756 implements Sequence {

  private long mN = -1;

  private boolean is(long m) {
    long t = 15;
    while (m != 0) {
      final long u = m % 15;
      m /= 15;
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

