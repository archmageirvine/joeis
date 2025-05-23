package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-24.ack/lambdan at 2025-05-24 23:04

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A384200 Expansion of e.g.f. -log(1 - 3*x)/(3 * (1 - x)).
 * @author Georg Fischer
 */
public class A384200 extends LambdaSequence {

  /** Construct the sequence. */
  public A384200() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(3).pow(k - 1).divide(k)).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
