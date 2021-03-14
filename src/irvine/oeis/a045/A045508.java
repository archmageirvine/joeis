package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A045508 Concatenate factorials.
 * @author Sean A. Irvine
 */
public class A045508 extends A000142 {

  private final StringBuilder mA = new StringBuilder();
  {
    super.next();
  }

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
