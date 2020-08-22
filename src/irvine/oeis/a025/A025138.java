package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025138 a(n) = (1/2)*(3rd elementary symmetric function of C(n,0), C(n,1), ..., C(n,[ n/2 ]).
 * @author Sean A. Irvine
 */
public class A025138 extends A025137 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
