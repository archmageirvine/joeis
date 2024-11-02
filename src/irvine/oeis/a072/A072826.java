package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A072826 Primes p such that p-1 is a highly composite number.
 * @author Sean A. Irvine
 */
public class A072826 extends A002182 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.add(1).isProbablePrime()) {
        return c.add(1);
      }
    }
  }
}
