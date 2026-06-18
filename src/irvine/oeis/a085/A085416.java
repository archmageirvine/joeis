package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085416 Take prime[n] and continue adding 1,2,..., A085415(n) until one reaches a prime a(n).
 * @author Sean A. Irvine
 */
public class A085416 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long k = 0;
    while (true) {
      p = p.add(++k);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

