package irvine.oeis.a353;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A353225 Expansion of e.g.f. (1 - x^4)^(-1/x^3).
 * @author Georg Fischer
 */
public class A353225 extends LambdaSequence {

  /** Construct the sequence. */
  public A353225() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Functions.STIRLING1.z(n - 3L * k, n - 4L * k).abs(), Functions.FACTORIAL.z(n - 3 * k)).multiply(Functions.FACTORIAL.z(n))).num());
  }
}
