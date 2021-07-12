package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031545 Numbers k such that the continued fraction for sqrt(k) has even period and central term 47.
 * @author Sean A. Irvine
 */
public class A031545 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(47);
  }
}
