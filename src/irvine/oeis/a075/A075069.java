package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075069 Product of prime(n) consecutive numbers starting from prime(n).
 * @author Sean A. Irvine
 */
public class A075069 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z prod = p;
    for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
      prod = prod.multiply(p.add(k));
    }
    return prod;
  }
}

