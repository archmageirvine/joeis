package irvine.oeis.a103;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A103406 Triangle read by rows: n-th row = unsigned coefficients of the characteristic polynomials of an n X n matrix with 2&apos;s on the diagonal and 1&apos;s elsewhere.
 * T(n,k) = (k+1)*binomial(n,k)
 * @author Georg Fischer
 */
public class A103406 extends Triangle {

  /** Construct the sequence. */
  public A103406() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(k + 1);
  }
}
