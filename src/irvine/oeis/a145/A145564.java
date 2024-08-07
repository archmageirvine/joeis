package irvine.oeis.a145;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A145564 a(n) = numerator(Sum_{k=0..n} 1/(binomial(2*k,k)*(k+1))).
 * @author Georg Fischer
 */
public class A145564 extends LambdaSequence {

  /** Construct the sequence. */
  public A145564() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.ONE, Binomial.binomial(2L * k, k).multiply(k + 1))).num());
  }
}
