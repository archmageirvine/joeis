package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A386637 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k).
 * @author Sean A. Irvine
 */
public class A386637 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    if (p.equals(Z.SEVEN)) {
      p = super.next();
    }
    return Z.SEVEN.multiply(p.square());
  }
}
