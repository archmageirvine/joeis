package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031557 Numbers n such that continued fraction for sqrt(n) has even period and central term 59.
 * @author Sean A. Irvine
 */
public class A031557 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(59);
  }
}
