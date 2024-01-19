package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064607 Numbers k such that A064604(k) is divisible by k.
 * @author Sean A. Irvine
 */
public class A064607 extends A064604 {

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
