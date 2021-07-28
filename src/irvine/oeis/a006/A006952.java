package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a049.A049314;

/**
 * A006952 Number of conjugacy classes in GL(n,3).
 * @author Sean A. Irvine
 */
public class A006952 extends A049314 {

  @Override
  protected Z q() {
    return Z.THREE;
  }
}
