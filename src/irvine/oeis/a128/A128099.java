package irvine.oeis.a128;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A128099 Triangle read by rows: T(n,k) is the number of ways to tile a 3 X n rectangle with k pieces of 2 X 2 tiles and 3n-4k pieces of 1 X 1 tiles (0 &lt;= k &lt;= floor(n/2)).
 * <code>T(n, k) = 2^k*binomial(n-k,k).</code>
 * @author Georg Fischer
 */
public class A128099 extends BaseTriangle {

  /** Construct the sequence. */
  public A128099() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n - k, k).multiply(Z.ONE.shiftLeft(k));
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (!result.isZero()) {
        return result;
      }
    }
  }
}
