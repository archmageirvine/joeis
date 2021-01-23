package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029791 Squares such that digits of sqrt(n) are not present in n or n^(3/2).
 * @author Sean A. Irvine
 */
public class A029791 extends A029790 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
