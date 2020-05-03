package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031541 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 43.
 * @author Sean A. Irvine
 */
public class A031541 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(43);
  }
}
