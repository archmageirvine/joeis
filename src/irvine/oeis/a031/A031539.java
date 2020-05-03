package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031539 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 41.
 * @author Sean A. Irvine
 */
public class A031539 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(41);
  }
}
