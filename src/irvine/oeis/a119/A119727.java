package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119727 Triangular array: T(n,k) = T(n,n) = 1, T(n,k) = 5*T(n-1, k-1) + 2*T(n-1, k), read by rows.
 * @author Georg Fischer
 */
public class A119727 extends Triangle {

  /** Construct the sequence. */
  public A119727() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 || k == n ? Z.ONE : get(n - 2, k - 2).multiply(5).add(get(n - 2, k - 1).multiply2());
  }
}
