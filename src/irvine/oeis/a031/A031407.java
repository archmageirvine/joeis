package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031407 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period <code>2*m</code> and the m-th term is 4.
 * @author Sean A. Irvine
 */
public class A031407 extends A031404 {

  @Override
  protected Z target() {
    return Z.FOUR;
  }
}
