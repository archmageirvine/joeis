package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029782 Cubes such that digits of cube root of n appear in both <code>n^(2/3)</code> and <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029782 extends A029780 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
