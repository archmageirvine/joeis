package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053218 Triangle read by rows where the first element in row n is n, and for k &gt;= 2 element k in row n is the sum of element k-1 in row n and element k-1 in row n-1.
 * @author Georg Fischer
 */
public class A053218 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(n + 1) : get(n, k - 1).add(get(n - 1, k - 1));
  }
}
