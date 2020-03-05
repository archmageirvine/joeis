package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029788 Squares such that digits of <code>sqrt(n)</code> are not present in <code>n^(3/2)</code>.
 * @author Sean A. Irvine
 */
public class A029788 extends A029787 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
