package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031529 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 31.
 * @author Sean A. Irvine
 */
public class A031529 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(31);
  }
}
