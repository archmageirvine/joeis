package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A046154 Primes of the form n*2^phi(n)+1 with phi the Euler function.
 * @author Sean A. Irvine
 */
public class A046154 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      final Z phi = super.next();
      final Z a = Z.valueOf(mN).shiftLeft(phi.intValueExact()).add(1);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
