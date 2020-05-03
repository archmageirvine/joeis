package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031585 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 87.
 * @author Sean A. Irvine
 */
public class A031585 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(87);
  }
}
