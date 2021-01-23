package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031550 Numbers n such that continued fraction for sqrt(n) has even period and central term 52.
 * @author Sean A. Irvine
 */
public class A031550 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(52);
  }
}
