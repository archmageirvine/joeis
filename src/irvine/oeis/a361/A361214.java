package irvine.oeis.a361;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A361214 E.g.f. satisfies A(x) = exp( 3*x*A(x) / (1+x) ).
 * @author Georg Fischer
 */
public class A361214 extends LambdaSequence {

  /** Construct the sequence. */
  public A361214() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(-3).pow(k).multiply(Z.valueOf(k + 1).pow(k - 1)).multiply(Binomial.binomial(n - 1, n - k)), Functions.FACTORIAL.z(k)).multiply(Z.NEG_ONE.pow(n)).multiply(Functions.FACTORIAL.z(n))).num());
  }
}
