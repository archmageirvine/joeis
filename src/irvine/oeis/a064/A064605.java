package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064553.
 * @author Sean A. Irvine
 */
public class A064605 extends A064602 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
