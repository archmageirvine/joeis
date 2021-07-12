package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031616 Numbers k such that the continued fraction for sqrt(k) has odd period and central terms 28.
 * @author Sean A. Irvine
 */
public class A031616 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(28);
  }
}
