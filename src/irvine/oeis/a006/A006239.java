package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a212.A212801;

/**
 * A006239 Row 3 of array in <code>A212801</code>.
 * @author Sean A. Irvine
 */
public class A006239 extends A212801 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
