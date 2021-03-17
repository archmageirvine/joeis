package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000988;

/**
 * A006758 Number of strictly 2-dimensional one-sided polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006758 extends A000988 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
