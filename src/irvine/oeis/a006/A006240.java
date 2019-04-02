package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a212.A212801;

/**
 * A006240 Row 4 of array in A212801.
 * @author Sean A. Irvine
 */
public class A006240 extends A212801 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
