package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031415 Numbers n such that continued fraction for <code>sqrt(n)</code> has odd period and a pair of central terms both equal to 2.
 * @author Sean A. Irvine
 */
public class A031415 extends A031414 {

  @Override
  protected Z target() {
    return Z.TWO;
  }
}
