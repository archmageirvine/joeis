package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053218                                             Triangle read by rows: T(n,k) = T(n,k-1) + T(n-1,k-1) for k &gt;= 2 with T(n,1) = 1.
 * @author Georg Fischer
 */
public class A053218 extends Triangle {

  /** Construct the sequence. */
  public A053218() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(n + 1) : get(n, k - 1).add(get(n - 1, k - 1));
  }
}
