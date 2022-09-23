package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059402.
 * @author Sean A. Irvine
 */
public class A059402 extends A059401 {

  private long mN = 1196;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0 && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
