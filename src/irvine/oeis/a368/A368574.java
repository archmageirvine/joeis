package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A368574 a(n) = n! * Sum_{k=0..n} binomial(k+2,3) / k!.
 * @author Georg Fischer
 */
public class A368574 extends LambdaSequence {

  /** Construct the sequence. */
  public A368574() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(k + 2, 3), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
