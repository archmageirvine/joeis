package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A064271 Numbers k such that sigma(k) - 2k is prime.
 * @author Sean A. Irvine
 */
public class A064271 extends A000203 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(2 * ++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
