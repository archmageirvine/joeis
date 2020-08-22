package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029779 Numbers n such that digits of n appear in cube root of n.
 * @author Sean A. Irvine
 */
public class A029779 extends A029778 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
