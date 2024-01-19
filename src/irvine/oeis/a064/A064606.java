package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064606 Numbers k such that A064603(k) is divisible by k.
 * @author Sean A. Irvine
 */
public class A064606 extends A064603 {

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
