package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A195662 Triangle T(n,k) read by rows: T(0,0)= -3, T(1,0)= 2, T(1,1) = 0 and T(n,k) = T(n-1,k) -T(n-2,k-2) otherwise.
 * @author Georg Fischer
 */
public class A195662 extends Triangle {

  /** Construct the sequence. */
  public A195662() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.valueOf(-3);
    } else if (n == 1) {
      return k == 0 ? Z.TWO : Z.ZERO;
    }
    return get(n - 1, k).subtract(get(n - 2, k - 2));
  }
}
