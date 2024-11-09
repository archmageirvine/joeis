package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072982 Primes p for which the period of 1/p is a power of 2.
 * @author Sean A. Irvine
 */
public class A072982 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.isOdd() && !Z.FIVE.equals(p) && Functions.ORDER.z(p.intValueExact(), Z.TEN).bitCount() == 1) {
        return p;
      }
    }
  }
}

