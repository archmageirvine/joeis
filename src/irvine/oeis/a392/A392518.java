package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392518 Numbers k such that sigma(k) = psi(k) + tau(k)^2 + omega(k).
 * @author Sean A. Irvine
 */
public class A392518 extends A000040 {

  private static final Z M = Z.valueOf(37);

  @Override
  public Z next() {
    Z p = super.next();
    if (p.equals(M)) {
      p = super.next();
    }
    return M.multiply(p.square());
  }
}
