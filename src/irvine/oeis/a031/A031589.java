package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031589 Numbers k such that the continued fraction for sqrt(k) has even period and central term 91.
 * @author Sean A. Irvine
 */
public class A031589 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(91);
  }
}
