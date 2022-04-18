package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157636 Triangle read by rows: T(n, k) = 1 if k=0 or k=n, otherwise = n*k*(n-k)/2.
 * @author Georg Fischer
 */
public class A157636 extends Triangle {

  /** Construct the sequence. */
  public A157636() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || n == k ? Z.ONE : Z.valueOf(n).multiply(k).multiply(n - k).divide2();
  }
}
