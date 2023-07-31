package irvine.oeis.a137;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137153 Triangle, read by rows, where T(n,k) = C(2^k + n-k-1, n-k).
 * @author Georg Fischer
 */
public class A137153 extends BaseTriangle {

  /** Construct the sequence. */
  public A137153() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(Z.ONE.shiftLeft(k).add(n - k - 1), Z.valueOf(n - k));
  }
}
