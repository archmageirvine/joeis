package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031413 Numbers n such that continued fraction for sqrt(n) has even period 2*m and the m-th term is 10.
 * @author Sean A. Irvine
 */
public class A031413 extends A031404 {

  @Override
  protected Z target() {
    return Z.TEN;
  }
}
