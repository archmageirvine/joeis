package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031417 Numbers n such that continued fraction for sqrt(n) has odd period and a pair of central terms both equal to 4.
 * @author Sean A. Irvine
 */
public class A031417 extends A031415 {

  @Override
  protected Z target() {
    return Z.FOUR;
  }
}
