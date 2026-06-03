package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A085106 Starting with composite(n) go on adding smaller composite numbers until one gets a prime. a(n) = this prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A085106 extends A002808 {

  @Override
  public Z next() {
    Z c = super.next();
    Z sum = c;
    while (c.compareTo(Z.FOUR) > 0) {
      do {
        c = c.subtract(1);
      } while (c.isProbablePrime());
      sum = sum.add(c);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
    return Z.ZERO;
  }
}

