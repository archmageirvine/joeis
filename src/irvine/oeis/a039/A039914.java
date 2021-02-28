package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A039914 Smallest k&gt;1 such that k(p-1)-1 is divisible by p^2, p=n-th prime.
 * @author Sean A. Irvine
 */
public class A039914 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p2 = p.square();
    final Z p1 = p.subtract(1);
    long k = 1;
    while (!Z.ZERO.equals(p1.multiply(++k).subtract(1).mod(p2))) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
