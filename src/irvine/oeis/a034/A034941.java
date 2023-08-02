package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034941 Number of labeled triangular cacti with 2n+1 nodes (n triangles).
 * @author Sean A. Irvine
 */
public class A034941 extends A034940 {

  @Override
  public Z next() {
    return super.next().divide(2L * mN + 1);
  }
}
