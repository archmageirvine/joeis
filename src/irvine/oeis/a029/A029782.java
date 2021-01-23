package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029782 Cubes such that digits of cube root of n appear in both n^(2/3) and n.
 * @author Sean A. Irvine
 */
public class A029782 extends A029780 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
