package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056558 Third tetrahedral coordinate, i.e., tetrahedron with T(t,n,k)=k; succession of growing finite triangles with increasing values towards bottom right.
 * @author Sean A. Irvine
 */
public class A056558 extends A056557 {

  @Override
  protected Z select(final long[] n) {
    return Z.valueOf(n[2]);
  }
}
