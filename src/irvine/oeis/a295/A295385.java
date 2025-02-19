package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-11-19.ack/lambdan at 2024-11-19 23:27

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A295385 a(n) = n!*Sum_{k=0..n} binomial(2*n,n-k)*n^k/k!.
 * @author Georg Fischer
 */
public class A295385 extends LambdaSequence {

  /** Construct the sequence. */
  public A295385() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(2L * n, n - k)).multiply(new Q(n).pow(k)).divide(Functions.FACTORIAL.z(k)))).num());
  }
}
