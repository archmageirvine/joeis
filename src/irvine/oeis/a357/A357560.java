package irvine.oeis.a357;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357560 a(n) = the numerator of ( Sum_{k = 1..n} (-1)^(n+k)*(1/k)*binomial(n,k)* binomial(n+k,k)^2 ).
 * @author Georg Fischer
 */
public class A357560 extends LambdaSequence {

  /** Construct the sequence. */
  public A357560() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(1, k).multiply(Z.NEG_ONE.pow(n + k)).multiply(Binomial.binomial(n, k).multiply(Binomial.binomial(n + k, k).square()))).num());
  }
}
