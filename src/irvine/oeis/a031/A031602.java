package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031602 Numbers n such that continued fraction for sqrt(n) has odd period and central term 14.
 * @author Sean A. Irvine
 */
public class A031602 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(14);
  }
}
