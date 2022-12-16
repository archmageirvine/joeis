package irvine.oeis.a277;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A277078 Triangular array similar to A255935 but with 0's and 2's swapped in the trailing diagonal. The columns alternate in signs.
 * @author Georg Fischer
 */
public class A277078 extends BaseTriangle {

  /** Construct the sequence. */
  public A277078() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // If[k == n, 2 - 2*Mod[n, 2], (-1)^k*Binomial[n, k]]
    return (k == n) ? Z.valueOf(2 - (n & 1) * 2) : Binomial.binomial(n, k).multiply((k & 1) == 0 ? 1 : -1);
  }
}
