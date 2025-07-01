package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A385301 a(n) = Sum_{k=0..p-1} 1/k! mod p where p is prime(n) and 1/k! is the inverse of k! modulo p.
 * @author Sean A. Irvine
 */
public class A385301 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z sum = Z.ONE;
    for (Z k = Z.ONE, invf = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
      invf = invf.multiply(k.modInverse(p));
      sum = sum.add(invf).mod(p);
    }
    return sum;
  }
}


