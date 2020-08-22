package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031518 Numbers n such that continued fraction for sqrt(n) has even period and central term 20.
 * @author Sean A. Irvine
 */
public class A031518 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(20);
  }
}
