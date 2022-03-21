package irvine.oeis.a273;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A273169 Numerators of coefficient triangle for integrated even powers of cos(x) in terms of x and sin(2*m*x).
 * R(n , 0) = (1/2^(2*n))*(binomial(2*n,n) and R(n, m) = (1/2^(2*n))*binomial(2*n, n-m)/m for m = 1, ..., n, n &gt= 0
 * @author Georg Fischer
 */
public class A273169 extends RationalTriangle {

  /** Construct the sequence. */
  public A273169() {
    hasRAM(true);
  }

  @Override
  public Q compute(final int n, final int k) {
    return n == 0 ? Q.ONE : (k == 0
      ? new Q(Binomial.binomial(2L * n, n), Z.ONE.shiftLeft(2 * n))
      : new Q(Binomial.binomial(2L * n, n - k), Z.ONE.shiftLeft(2 * n).multiply(k))
    );
  }
}
