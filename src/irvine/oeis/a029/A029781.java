package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029781 Squares such that digits of sqrt(n) appear in both n and n^(3/2).
 * @author Sean A. Irvine
 */
public class A029781 extends A029780 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
