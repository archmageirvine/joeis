package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031671 Numbers n such that continued fraction for <code>sqrt(n)</code> has odd period and central terms 83.
 * @author Sean A. Irvine
 */
public class A031671 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(83);
  }
}
