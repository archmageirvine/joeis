package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A368766 a(n) = n! * (1 + Sum_{k=0..n} (-1)^k * binomial(k+1,2) / k!).
 * @author Georg Fischer
 */
public class A368766 extends LambdaSequence {

  /** Construct the sequence. */
  public A368766() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.NEG_ONE.pow(k).multiply(Binomial.binomial(k + 1, 2)), Functions.FACTORIAL.z(k))).add(Q.ONE).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
