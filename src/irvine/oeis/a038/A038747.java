package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a033.A033155;

/**
 * A038747 Coefficients arising in the enumeration of configurations of linear chains.
 * @author Sean A. Irvine
 */
public class A038747 extends A033155 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
