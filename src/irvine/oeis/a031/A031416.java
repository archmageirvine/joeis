package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031416 Numbers k such that the continued fraction for sqrt(k) has odd period and a pair of central terms both equal to 3.
 * @author Sean A. Irvine
 */
public class A031416 extends A031414 {

  @Override
  protected Z target() {
    return Z.THREE;
  }
}
