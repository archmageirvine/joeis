package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026140 <code>a(n) = (1/2)*(s(n) - 1)</code>, where s <code>= A026139</code>.
 * @author Sean A. Irvine
 */
public class A026140 extends A026139 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
