package irvine.oeis.a342;
// Generated by gen_seq4.pl 2024-11-19.ack/lambdan at 2024-11-19 23:27

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A342933 a(n) = n! * Sum_{k=1..n} k^2/floor(n/k).
 * @author Georg Fischer
 */
public class A342933 extends LambdaSequence {

  /** Construct the sequence. */
  public A342933() {
    super(1, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(1, n, k -> new Q(k).square().divide(n / k))).num());
  }
}
