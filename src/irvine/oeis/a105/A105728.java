package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A105728 Triangle read by rows: T(n,1) = 1, T(n,n) = n and for 1 &lt; k &lt; n: T(n,k) = T(n-1,k-1) + 2*T(n-1,k).
 * @author Georg Fischer
 */
public class A105728 extends Triangle {

  /** Construct the sequence. */
  public A105728() {
    hasRAM(false);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? Z.ONE : (k == n ? Z.valueOf(n) : get(n - 2, k - 2).add(get(n - 2, k - 1).multiply2()));
  }
}
