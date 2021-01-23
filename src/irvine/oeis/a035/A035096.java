package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A035096 a(n) is the smallest k such that prime(n)*k+1 is prime.
 * @author Sean A. Irvine
 */
public class A035096 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(p).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
