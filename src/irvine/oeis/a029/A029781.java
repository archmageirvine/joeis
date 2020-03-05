package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029781 Squares such that digits of <code>sqrt(n)</code> appear in both n and <code>n^(3/2)</code>.
 * @author Sean A. Irvine
 */
public class A029781 extends A029780 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
