package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A053120 Triangle of coefficients of Chebyshev's T(n,x) polynomials (powers of x in increasing order).
 * @author Georg Fischer
 */
public class A053120 extends BaseTriangle {

  /** Construct the sequence. */
  public A053120() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int m) {
    // T(n, m) := 0 if n < m or n+m odd; T(n, m) = (-1)^(n/2) if m=0 (n even); otherwise T(n, m) = ((-1)^((n+m)/2 + m))*(2^(m-1))*n*binomial((n+m)/2-1, m-1)/m.
    if (((n + m) & 1) == 1) {
      return Z.ZERO;
    }
    if (m == 0 && (n & 1) == 0) {
      return Z.NEG_ONE.pow(n / 2);
    }
    return Binomial.binomial((n + m) / 2 - 1, m - 1).multiply(n).multiply(Z.ONE.shiftLeft(m - 1)).multiply(((((n + m) / 2 + m) & 1) == 0) ? 1 : -1).divide(m);
  }
}
