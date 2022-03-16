package irvine.oeis.a273;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A273171 Triangle for numerators of coefficients for integrated odd powers of cos(x) in terms sin((2*m+1)*x).
 * R(n, m) = (1/2^(2*n)) * binomial(2*n+1, n-m)/(2*m+1) for m = 0, ..., n, n &gt;= 0.
 * @author Georg Fischer
 */
public class A273171 extends RationalTriangle {

  /** Construct the sequence. */
  public A273171() {
    hasRAM(true);
  }

  @Override
  public Q compute(final int n, final int k) {
    return n == 0 ? Q.ONE : new Q(Binomial.binomial(2 * n + 1, n - k), Z.ONE.shiftLeft(2 * n).multiply(2 * k + 1));
  }
}
