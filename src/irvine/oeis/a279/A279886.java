package irvine.oeis.a279;
// Generated by gen_seq4.pl 2024-11-21.ack/lambdan at 2024-11-21 23:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A279886 a(n) = A057863(n+1) * Sum_{k=0..n}(k! / (2*k+1)!!).
 * @author Georg Fischer
 */
public class A279886 extends LambdaSequence {

  /** Construct the sequence. */
  public A279886() {
    super(0, n -> Rationals.SINGLETON.product(0, n, k -> Rationals.SINGLETON.product(0, k, i -> new Q(2L * i + 1))).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(k)).divide(Rationals.SINGLETON.product(0, k, i -> new Q(2L * i + 1))))).num());
  }
}
