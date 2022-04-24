package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056559 Tetrahedron with T(t,n,k) = t - n; succession of growing finite triangles with declining values per row.
 * @author Sean A. Irvine
 */
public class A056559 extends A056557 {

  @Override
  protected Z select(final long[] n) {
    return Z.valueOf(n[0] - n[1]);
  }
}
