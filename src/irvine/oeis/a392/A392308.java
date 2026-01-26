package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392308 Composite numbers c satisfying the congruence c * sigma_k(c) == 2 (mod phi(c)) that are "flanked" by 14 at k-1 and k+1.
 * @author Sean A. Irvine
 */
public class A392308 extends A000040 {

  private boolean is(final Z p) {
    if (p.compareTo(Z.FIVE) < 0) {
      return true;
    }
    if (p.mod(4) == 3) {
      final Z r = p.divide2(); // (p-1)/2
      final Z z = Functions.ORDER.z(r.longValueExact(), Z.TWO);
      if (z.mod(4) == 0) {
        return Z.TWO.modPow(z.divide2(), r).equals(r.subtract(1));
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p.multiply2();
      }
    }
  }
}
