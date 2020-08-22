package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031611 Numbers n such that continued fraction for sqrt(n) has odd period and central term 23.
 * @author Sean A. Irvine
 */
public class A031611 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(23);
  }
}
