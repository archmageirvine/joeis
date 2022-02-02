package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055801 Triangle T read by rows: T(i,0)=T(i,i)=1, T(i,j) = Sum_{k=1..floor(n/2)} T(i-2k, j-2k+1) for 1&lt;=j&lt;=i-1, where T(m,n) := 0 if m&lt;0 or n&lt;0.
 * @author Georg Fischer
 */
public class A055801 extends Triangle {

  @Override
  public Z compute(final int i, final int j) {
    if (j == 0 || j == i) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= i / 2; ++k) {
      sum = sum.add(get(i - 2 * k, j - 2 * k + 1));
    }
    return sum;
  }
}
