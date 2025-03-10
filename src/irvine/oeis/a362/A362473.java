package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-11-19.ack/lambdan at 2024-11-19 23:27

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A362473 E.g.f. satisfies A(x) = exp(x + x^4 * A(x)^4).
 * @author Georg Fischer
 */
public class A362473 extends LambdaSequence {

  /** Construct the sequence. */
  public A362473() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n / 4, k -> new Q(4L * k + 1).pow(n - 3L * k - 1).divide(new Q(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(n - 4 * k))))).num());
  }
}
