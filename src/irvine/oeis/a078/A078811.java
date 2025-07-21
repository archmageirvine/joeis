package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078811 a(n) = A078217(n)/n.
 * @author Sean A. Irvine
 */
public class A078811 extends A078217 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
