package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031421 Numbers k such that the continued fraction for sqrt(k) has odd period and a pair of central terms both equal to 8.
 * @author Sean A. Irvine
 */
public class A031421 extends A031415 {

  @Override
  protected Z target() {
    return Z.EIGHT;
  }
}
