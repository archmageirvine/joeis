package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365756 G.f. satisfies A(x) = 1 + x*A(x) / (1 - x^3*A(x)^4).
 * @author Georg Fischer
 */
public class A365756 extends LambdaSequence {

  /** Construct the sequence. */
  public A365756() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Binomial.binomial(n - 2L * k - 1, k).multiply(Binomial.binomial(n + k + 1, n - 3L * k)), Z.valueOf(n + k + 1))).num());
  }
}
