package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064713 Numbers k such that prime(k)^2 - k is prime.
 * @author Sean A. Irvine
 */
public class A064713 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().square().subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
