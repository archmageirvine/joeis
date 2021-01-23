package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A037852 Number of normal subgroups of dihedral group with 2n elements.
 * @author Sean A. Irvine
 */
public class A037852 extends A000005 {

  @Override
  public Z next() {
    return super.next().add((mN & 1) == 0 ? 3 : 1);
  }
}
