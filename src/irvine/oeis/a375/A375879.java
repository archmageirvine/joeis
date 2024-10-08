package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-16.ack/lambdan at 2024-09-16 19:36

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A375879 E.g.f. satisfies A(x) = 1/(1 - x)^(3*A(x)^(1/3)).
 * @author Georg Fischer
 */
public class A375879 extends LambdaSequence {

  /** Construct the sequence. */
  public A375879() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(k + 3).pow(k - 1).multiply(Functions.STIRLING1.z(n, k).abs())).multiply(3).num());
  }
}
