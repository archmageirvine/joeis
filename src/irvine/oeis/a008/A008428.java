package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000141;

/**
 * A008428 Theta series of D_6 lattice.
 * @author Sean A. Irvine
 */
public class A008428 extends A000141 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
