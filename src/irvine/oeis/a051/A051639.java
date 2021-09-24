package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A051639 Concatenation of 3^k, k = 0,..,n.
 * @author Sean A. Irvine
 */
public class A051639 extends A000244 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
