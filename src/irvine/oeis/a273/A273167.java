package irvine.oeis.a273;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A273167 Numerators of coefficient triangle for expansion of x^(2*n) in terms of Chebyshev polynomials of the first kind T(2*m, x) (A127674).
 * R(n, 0) = (1/2^(2*n-1))*binomial(2*n,n)/2 and R(n ,m) = (1/2^(2*n-1))*binomial(2*n, n-m) for m =1..n, n &gt;= 0.
 * @author Georg Fischer
 */
public class A273167 extends RationalTriangle {

  /** Construct the sequence. */
  public A273167() {
    hasRAM(true);
  }

  @Override
  public Q compute(final int n, final int k) {
    return n == 0 ? Q.ONE : (k == 0
      ? new Q(Binomial.binomial(2 * n, n), Z.ONE.shiftLeft(2 * n - 1).multiply2())
      : new Q(Binomial.binomial(2 * n, n - k), Z.ONE.shiftLeft(2 * n - 1))
    );
  }
}
