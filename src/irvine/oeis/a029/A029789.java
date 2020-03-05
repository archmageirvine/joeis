package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029789 Cubes such that digits of <code>n^(2/3)</code> are not present in <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029789 extends A029787 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
