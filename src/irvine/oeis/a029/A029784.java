package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029784 Squares such that digits of <code>sqrt(n)</code> are not present in <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029784 extends A029783 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
