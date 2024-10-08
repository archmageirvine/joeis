package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-08-26.ack/lambdan at 2024-08-26 22:41

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A073014 (n!/2)*sum(k=1,n,(n+k)!/(k!)^3).
 * @author Georg Fischer
 */
public class A073014 extends LambdaSequence {

  /** Construct the sequence. */
  public A073014() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Functions.FACTORIAL.z(n + k), Functions.FACTORIAL.z(k).pow(3))).multiply(Functions.FACTORIAL.z(n)).divide(2).num());
  }
}
