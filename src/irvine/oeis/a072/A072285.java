package irvine.oeis.a072;
// manually at 2024-03-28

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A072285 Numerators of inverse unimodal analog of binomial coefficients: binomial(n,m) = Sum_{k=0..n-m} a(2*k+m-1, 2*k).
 * @author Georg Fischer
 */
public class A072285 extends LambdaTriangle {

  /** Construct the sequence. */
  public A072285() {
    super(0, 0, 0, (n, m) -> Binomial.binomial(new Q(n + 1).subtract(new Q(m, 2)), n - m + 1).subtract(Binomial.binomial(new Q(n).subtract(new Q(m, 2)), n - m + 1)).num());
  }
}
