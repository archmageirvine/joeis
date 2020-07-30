package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000086;

/**
 * A034017.
 * @author Sean A. Irvine
 */
public class A034017 extends A000086 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      if (!Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

