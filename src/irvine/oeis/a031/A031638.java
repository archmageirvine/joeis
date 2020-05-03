package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031638 Numbers n such that continued fraction for <code>sqrt(n)</code> has odd period and central term 50.
 * @author Sean A. Irvine
 */
public class A031638 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(50);
  }
}
