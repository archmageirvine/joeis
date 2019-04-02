package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A007616 Palindromic reflectable primes.
 * @author Sean A. Irvine
 */
public class A007616 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.toString().matches("[0138]*")) {
        return p;
      }
    }
  }
}
