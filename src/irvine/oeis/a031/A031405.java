package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031405 Numbers k such that the continued fraction for sqrt(k) has even period 2*m and the m-th term of the periodic part is 2.
 * @author Sean A. Irvine
 */
public class A031405 extends A031404 {

  @Override
  protected Z target() {
    return Z.TWO;
  }
}
