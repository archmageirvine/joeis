package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031597 Numbers k such that the continued fraction for sqrt(k) has even period and central term 99.
 * @author Sean A. Irvine
 */
public class A031597 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(99);
  }
}
