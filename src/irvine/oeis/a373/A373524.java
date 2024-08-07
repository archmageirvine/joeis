package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-09/lambdan at 2024-06-09 23:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A373524 Expansion of e.g.f. exp(x * (1 + x^4)^(1/4)).
 * @author Georg Fischer
 */
public class A373524 extends LambdaSequence {

  /** Construct the sequence. */
  public A373524() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> Binomial.binomial(new Q(n - 4L * k, 4), k).divide(Functions.FACTORIAL.z(n - 4 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
