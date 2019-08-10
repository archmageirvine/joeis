package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025138 <code>a(n) = (1/2)*(3rd</code> elementary symmetric function of <code>C(n,0), C(n,1)</code>, ..., <code>C(n,[ n/2 ])</code>.
 * @author Sean A. Irvine
 */
public class A025138 extends A025137 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
