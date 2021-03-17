package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a007.A007727;

/**
 * A045630 Number of 2n-bead black-white complementable strings with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045630 extends A007727 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next().divide2());
  }
}
