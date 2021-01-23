package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029786 Cubes such that digits of cube root of n are not present in n.
 * @author Sean A. Irvine
 */
public class A029786 extends A029785 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
