package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031406 Numbers k such that the continued fraction for sqrt(k) has even period 2*m and the m-th term is 3.
 * @author Sean A. Irvine
 */
public class A031406 extends A031404 {

  @Override
  protected Z target() {
    return Z.THREE;
  }
}
