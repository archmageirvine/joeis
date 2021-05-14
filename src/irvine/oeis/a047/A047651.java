package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047651 Minimal positive value of tau modulo primes in A047650.
 * @author Sean A. Irvine
 */
public class A047651 extends A047650 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.modSquare(p).subtract(k).subtract(1).mod(p).isZero()) {
        return k;
      }
    }
  }
}
