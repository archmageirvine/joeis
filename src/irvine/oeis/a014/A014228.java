package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A014228 Product of 3 successive Catalan numbers.
 * @author Sean A. Irvine
 */
public class A014228 extends A000108 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z prod = mA.multiply(mB);
    mA = mB;
    mB = super.next();
    return prod.multiply(mB);
  }
}
