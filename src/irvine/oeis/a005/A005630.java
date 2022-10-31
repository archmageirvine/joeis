package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000628;

/**
 * A005630 Number of chiral trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005630 extends A005629 {

  private final A000628 mA628 = new A000628();
  {
    mA628.next();
  }

  @Override
  public Z next() {
    return mA628.next().subtract(super.next());
  }
}
