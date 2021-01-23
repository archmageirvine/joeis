package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a045.A045912;

/**
 * A006136 T(n+3,3) from table A045912 of characteristic polynomial of negative Pascal matrix.
 * @author Sean A. Irvine
 */
public class A006136 extends A045912 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN + 3, mN);
  }
}
