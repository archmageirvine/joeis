package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029791 Squares such that digits of <code>sqrt(n)</code> are not present in n or <code>n^(3/2)</code>.
 * @author Sean A. Irvine
 */
public class A029791 extends A029790 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
