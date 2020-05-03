package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031566 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 68.
 * @author Sean A. Irvine
 */
public class A031566 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(68);
  }
}
