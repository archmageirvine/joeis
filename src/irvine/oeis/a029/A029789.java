package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029789 Cubes such that digits of n^(2/3) are not present in n.
 * @author Sean A. Irvine
 */
public class A029789 extends A029787 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
