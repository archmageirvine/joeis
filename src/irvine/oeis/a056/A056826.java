package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A056826 Primes p such that (p^p + 1)/(p + 1) is a prime.
 * @author Sean A. Irvine
 */
public class A056826 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(p).add(1).divide(p.add(1)).isProbablePrime()) {
        return p;
      }
    }
  }
}
