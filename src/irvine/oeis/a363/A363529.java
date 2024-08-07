package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-28/lambda at 2023-09-28 21:04

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A363529 E.g.f. satisfies A(x) = exp(x * (1 + x * A(x)^4)).
 * @author Georg Fischer
 */
public class A363529 extends LambdaSequence {

  /** Construct the sequence. */
  public A363529() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(4L * n - 4L * k + 1).pow(k - 1).multiply(Binomial.binomial(k, n - k)).divide(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(n))).num());
  }
}
