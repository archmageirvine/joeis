package irvine.oeis.a142;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A142963 Triangle read by rows, coefficients of the polynomials P(k, x) = (1/2) Sum_{p=0..k-1} Stirling2(k, p+1)*x^p*(1-4*x)^(k-1-p)*(2*p+2)!/(p+1)!.
 * @author Georg Fischer
 */
public class A142963 extends Triangle {

  /** Construct the sequence. */
  public A142963() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n,m) = (m+1)*T(n-1,m) + (4*n-4*m-2)*T(n-1,m-1) with T(n,m=0) = 1 and T(n,m=n-1) = 2^(n-1), n >= 1 and 0 <= m <= n-1. */
  @Override
  protected Z compute(int n, final int k) {
    ++n;
    return k == 0 ? Z.ONE : (k == n - 1 ? Z.ONE.shiftLeft(n - 1) : get(n - 2, k - 1).multiply(4 * (n - k) - 2).add(get(n - 2, k).multiply(k + 1)));
  }
}
