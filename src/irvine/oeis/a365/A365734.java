package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 08:06

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365734 G.f. satisfies A(x) = 1 + x*A(x) / (1 - x^5*A(x)^2).
 * @author Georg Fischer
 */
public class A365734 extends LambdaSequence {

  /** Construct the sequence. */
  public A365734() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 5, k -> new Q(Binomial.binomial(n - 4L * k - 1, k).multiply(Binomial.binomial(n - 3L * k + 1, n - 5L * k)), Z.valueOf(n - 3L * k + 1))).num());
  }
}
