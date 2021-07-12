package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031548 Numbers k such that the continued fraction for sqrt(k) has even period and central term 50.
 * @author Sean A. Irvine
 */
public class A031548 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(50);
  }
}
