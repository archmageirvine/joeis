package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085415 Take prime(n) and continue adding 1, 2, ..., a(n) until one reaches a prime.
 * @author Sean A. Irvine
 */
public class A085415 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long k = 0;
    while (true) {
      p = p.add(++k);
      if (p.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

