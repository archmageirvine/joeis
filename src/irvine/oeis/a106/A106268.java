package irvine.oeis.a106;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a088.A088218;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A106268 Number triangle T(n,k) = (-1)^(n-k)*binomial(k-n, n-k) = (0^(n-k) + binomial(2*(n-k), n-k))/2 if k &lt;= n, 0 otherwise; Riordan array (1/(2-C(x)), x) where C(x) is g.f. for Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A106268 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A106268() {
    super(0, new A088218());
  }
}

