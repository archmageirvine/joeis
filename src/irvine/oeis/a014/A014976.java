package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A014976.
 * @author Sean A. Irvine
 */
public class A014976 extends A000796 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
