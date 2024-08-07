package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 18:32

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365132 G.f. satisfies A(x) = (1 + x*A(x)*(1 + x*A(x))^3)^3.
 * @author Georg Fischer
 */
public class A365132 extends LambdaSequence {

  /** Construct the sequence. */
  public A365132() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(3L * (n + 1), k).multiply(Binomial.binomial(3L * k, n - k)), Z.valueOf(n + 1))).num());
  }
}
