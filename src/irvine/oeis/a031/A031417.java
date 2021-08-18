package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031417 Numbers k such that the continued fraction for sqrt(k) has odd period and if the last term of the periodic part is deleted then there are a pair of central terms both equal to 4.
 * @author Sean A. Irvine
 */
public class A031417 extends A031415 {

  @Override
  protected Z target() {
    return Z.FOUR;
  }
}
