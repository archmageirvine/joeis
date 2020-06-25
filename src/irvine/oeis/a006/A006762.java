package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001168;

/**
 * A006762 Number of strictly 2-dimensional fixed polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006762 extends A001168 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.ZERO.max(super.next().subtract(2));
  }
}
