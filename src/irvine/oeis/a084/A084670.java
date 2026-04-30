package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084670 Numbers k such that concatenation of prime(k) and k is prime.
 * @author Sean A. Irvine
 */
public class A084670 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(super.next().toString() + ++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
