package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026140 a(n) = (1/2)*(s(n) - 1), where s = A026139.
 * @author Sean A. Irvine
 */
public class A026140 extends A026139 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
