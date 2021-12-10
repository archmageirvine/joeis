package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A128064 Triangle T with T(n,n)=n, T(n,n-1)=-(n-1) and otherwise T(n,k)=0; 0&lt;k&lt;=n.
 * @author Georg Fischer
 */
public class A128064 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    if (n == 1) {
      return Z.ONE;
    } else if (k == n) {
      return Z.valueOf(n);
    } else if (k == n - 1) {
      return Z.valueOf(-k);
    } else {
      return Z.ZERO;
    }
  }
}
