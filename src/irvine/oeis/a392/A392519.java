package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392519 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + omega(k).
 * @author Sean A. Irvine
 */
public class A392519 extends A000040 {

  private static final Z Z1297 = Z.valueOf(1297);

  @Override
  public Z next() {
    Z p = super.next();
    if (Z1297.equals(p)) {
      p = super.next();
    }
    return Z1297.multiply(p.square());
  }
}

