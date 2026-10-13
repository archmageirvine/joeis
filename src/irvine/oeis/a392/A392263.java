package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392263 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A392263 extends A000040 {

  private static final Z Z13 = Z.valueOf(13);

  @Override
  public Z next() {
    Z p = super.next();
    if (Z13.equals(p)) {
      p = super.next();
    }
    return Z13.multiply(p.square());
  }
}

