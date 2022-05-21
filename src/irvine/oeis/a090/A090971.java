package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A090971 Sierpi\u0144ski's triangle, read by rows, starting from 1: T(n,k) = (T(n-1,k) + T(n-1,k-1)) mod 2.
 * @author Georg Fischer
 */
public class A090971 extends Triangle {

  /** Construct the sequence. */
  public A090971() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf((n + 1) & 1) : (k == n ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k)).mod(Z.TWO));
  }
}
