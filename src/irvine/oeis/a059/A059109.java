package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A059109 m*phi(m)-1 is prime, where phi is the Euler function (A000010).
 * @author Sean A. Irvine
 */
public class A059109 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

