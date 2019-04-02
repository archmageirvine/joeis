package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a038.A038119;
import irvine.oeis.a068.A068870;

/**
 * A006767 Number of 4-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006767 extends A068870 {

  {
    super.next();
  }

  private final A038119 mA = new A038119();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
