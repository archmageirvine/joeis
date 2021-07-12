package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031565 Numbers k such that the continued fraction for sqrt(k) has even period and central term 67.
 * @author Sean A. Irvine
 */
public class A031565 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(67);
  }
}
