package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A046153 Primes of the form m*2^phi(m)-1 with phi(m) the Euler function, in order of increasing m.
 * @author Sean A. Irvine
 */
public class A046153 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      final Z phi = super.next();
      final Z a = Z.valueOf(mN).shiftLeft(phi.intValueExact()).subtract(1);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
