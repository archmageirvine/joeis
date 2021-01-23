package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031408 Numbers n such that continued fraction for sqrt(n) has even period 2*m and the m-th term is 5.
 * @author Sean A. Irvine
 */
public class A031408 extends A031404 {

  @Override
  protected Z target() {
    return Z.FIVE;
  }
}
