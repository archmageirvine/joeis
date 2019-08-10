package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025132 <code>a(n) = (1/2)*(3rd</code> elementary symmetric function of <code>C(n,0), C(n,1)</code>, ..., <code>C(n,n))</code>.
 * @author Sean A. Irvine
 */
public class A025132 extends A025131 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
