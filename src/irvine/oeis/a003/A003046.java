package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003046 Product of first n Catalan numbers.
 * @author Sean A. Irvine
 */
public class A003046 extends A000108 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(super.next());
    return mA;
  }
}
