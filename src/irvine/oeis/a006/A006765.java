package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000105;

/**
 * A006765 Number of strictly 2-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006765 extends A000105 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
