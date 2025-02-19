package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A076483 a(n) = n!*Sum_{k=1..n} (k-1)^k/k!.
 * @author Georg Fischer
 */
public class A076483 extends LambdaSequence {

  /** Construct the sequence. */
  public A076483() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(1, n, k -> new Q(k - 1).pow(k).divide(Functions.FACTORIAL.z(k)))).num());
  }
}
