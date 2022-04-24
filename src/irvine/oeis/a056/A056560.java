package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056560 Tetrahedron with T(t,n,k)=n-k; succession of growing finite triangles with increasing values towards bottom left.
 * @author Sean A. Irvine
 */
public class A056560 extends A056557 {

  @Override
  protected Z select(final long[] n) {
    return Z.valueOf(n[1] - n[2]);
  }
}
