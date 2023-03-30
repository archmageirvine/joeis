package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062404 Numbers k such that 2*k*prime(k) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A062404 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().multiply(++mN).multiply2().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
