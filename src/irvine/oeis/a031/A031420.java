package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031420 Numbers k such that the continued fraction for sqrt(k) has odd period and a pair of central terms both equal to 7.
 * @author Sean A. Irvine
 */
public class A031420 extends A031414 {

  @Override
  protected Z target() {
    return Z.SEVEN;
  }
}
