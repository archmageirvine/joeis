package irvine.oeis.a089;
// Generated by gen_seq4.pl 2023-09-22/lambda at 2023-09-23 22:31

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A089464 Hyperbinomial transform of A089461. Also the row sums of triangle A089463, which lists the coefficients for the third hyperbinomial transform.
 * @author Georg Fischer
 */
public class A089464 extends LambdaSequence {

  /** Construct the sequence. */
  public A089464() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(n - k + 3).pow(n - k - 1).multiply(3).multiply(Binomial.binomial(n, k))).num());
  }
}
