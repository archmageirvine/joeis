package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365758 G.f. satisfies A(x) = 1 + x*A(x) / (1 - x^4*A(x)^5).
 * @author Georg Fischer
 */
public class A365758 extends LambdaSequence {

  /** Construct the sequence. */
  public A365758() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Binomial.binomial(n - 3L * k - 1, k).multiply(Binomial.binomial(n + k + 1, n - 4L * k)), Z.valueOf(n + k + 1))).num());
  }
}
