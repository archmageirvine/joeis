package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031409 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period <code>2*m</code> and the m-th term is 6.
 * @author Sean A. Irvine
 */
public class A031409 extends A031404 {

  @Override
  protected Z target() {
    return Z.SIX;
  }
}
