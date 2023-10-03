package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066180 a(n) = smallest base b so that repunit (b^prime(n) - 1) / (b - 1) is prime, where prime(n) = n-th prime; or 0 if no such base exists.
 * @author Sean A. Irvine
 */
public class A066180 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z b = Z.ONE;
    while (true) {
      final Z bb = b;
      b = b.add(1);
      if (b.pow(p).subtract(1).divide(bb).isProbablePrime()) {
        return b;
      }
    }
  }
}
