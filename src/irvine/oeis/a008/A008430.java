package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000143;

/**
 * A008430 Theta series of <code>D_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A008430 extends A000143 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
