package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031412 Numbers n such that continued fraction for sqrt(n) has even period 2*m and the m-th term is 9.
 * @author Sean A. Irvine
 */
public class A031412 extends A031404 {

  @Override
  protected Z target() {
    return Z.NINE;
  }
}
