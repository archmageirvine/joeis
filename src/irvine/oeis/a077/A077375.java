package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077375 Numbers k such that 2^k + prime(k) is prime.
 * @author Sean A. Irvine
 */
public class A077375 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.pow(++mN).add(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
