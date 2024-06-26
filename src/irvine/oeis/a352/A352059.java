package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A352059 a(n) = Sum_{p|n, p prime} (n-1)!/(n/p-1)!.
 * @author Georg Fischer
 */
public class A352059 extends LambdaSequence {

  /** Construct the sequence. */
  public A352059() {
    super(1, n -> Rationals.SINGLETON.sopf(n, p -> new Q(Functions.FACTORIAL.z(n - 1), Functions.FACTORIAL.z(n / p - 1))).num());
  }
}
