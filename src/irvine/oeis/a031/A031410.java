package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031410 Numbers k such that the continued fraction for sqrt(k) has even period 2*m and the m-th term of the periodic part is 7.
 * @author Sean A. Irvine
 */
public class A031410 extends A031404 {

  @Override
  protected Z target() {
    return Z.SEVEN;
  }
}
