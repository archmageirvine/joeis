package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a046.A046134;

/**
 * A049437 Primes p such that p+2 and p+8 are also primes but p+6 is not.
 * @author Sean A. Irvine
 */
public class A049437 extends A046134 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.add(6).isProbablePrime()) {
        return p;
      }
    }
  }
}
