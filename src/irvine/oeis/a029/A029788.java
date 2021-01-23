package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029788 Squares such that digits of sqrt(n) are not present in n^(3/2).
 * @author Sean A. Irvine
 */
public class A029788 extends A029787 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
