package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 08:06

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365733 G.f. satisfies A(x) = 1 + x*A(x)*(1 + x^5*A(x)^3).
 * @author Georg Fischer
 */
public class A365733 extends LambdaSequence {

  /** Construct the sequence. */
  public A365733() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 6, k -> new Q(Binomial.binomial(n - 5L * k, k).multiply(Binomial.binomial(n - 2L * k + 1, n - 5L * k)), Z.valueOf(n - 2L * k + 1))).num());
  }
}
