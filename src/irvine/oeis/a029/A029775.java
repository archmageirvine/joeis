package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029775 Squares n such that the digits of n appear in <code>sqrt(n)</code>.
 * @author Sean A. Irvine
 */
public class A029775 extends A029774 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
