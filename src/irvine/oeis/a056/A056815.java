package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a045.A045918;

/**
 * A056815 Primes with prime "look and say" descriptions.
 * @author Sean A. Irvine
 */
public class A056815 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (new Z(A045918.lookAndSay(p.longValueExact())).isProbablePrime()) {
        return p;
      }
    }
  }
}

