package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A072828 Primes p such that p+1 is a highly composite number.
 * @author Sean A. Irvine
 */
public class A072828 extends A002182 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.subtract(1).isProbablePrime()) {
        return c.subtract(1);
      }
    }
  }
}
