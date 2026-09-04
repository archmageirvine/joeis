package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086448 a(n) = the least integer of the form [prime(n+1)+prime(n+2)+...+prime(n+k)]/prime(n).
 * @author Sean A. Irvine
 */
public class A086448 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    Z sum = Z.ZERO;
    while (true) {
      q = mPrime.nextPrime(q);
      sum = sum.add(q);
      if (sum.mod(p).isZero()) {
        return sum.divide(p);
      }
    }
  }
}

