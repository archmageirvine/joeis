package irvine.oeis.a130;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A130595 Triangle read by rows: lower triangular matrix which is inverse to Pascal's triangle (A007318) regarded as a lower triangular matrix.
 * @author Georg Fischer
 */
public class A130595 extends BaseTriangle {

  /** Construct the sequence. */
  public A130595() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(((n - k) & 1) == 1 ? -1 : 1);
  }
}
