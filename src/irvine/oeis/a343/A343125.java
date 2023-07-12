package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A343125 Triangle T(k, n) = (n+3)*(k-n) - 4, k &gt;= 2, 1 &lt;= n &lt;= k-1, read by rows.
 * @author Georg Fischer
 */
public class A343125 extends Triangle {

  /** Construct the sequence. */
  public A343125() {
    setOffset(2);
    hasRAM(true);
  }

  @Override
  public Z compute(int k, int n) {
    ++n;
    k = k + 2;
    return Z.valueOf((n + 3L) * (k - n) - 4);
  }
}
