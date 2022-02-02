package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055215 A path-counting array, read by rows: T(i,j)=number of paths from (0, 0) to (i-j,j) using steps (1 unit right and 1 unit up) or (1 unit right and 2 units up).
 * T(i, 0)=T(i, i)=1 for i &gt;= 0; T(i, 1)=1 for i &gt;= 1; T(i, j)=T(i-2, j-1)+T(i-3, j-2) for 2&lt;=j&lt;=i-1, i &gt;= 3.
 * @author Georg Fischer
 */
public class A055215 extends Triangle {

  @Override
  public Z compute(final int i, final int j) {
    if (j <= 1 || j == i) {
      return Z.ONE;
    }
    return get(i - 2, j - 1).add(get(i - 3, j - 2));
  }
}
