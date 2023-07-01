package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064361 Numbers k such that prime(k)^2 + k is prime.
 * @author Sean A. Irvine
 */
public class A064361 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().square().add(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
