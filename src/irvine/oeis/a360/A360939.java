package irvine.oeis.a360;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A360939 E.g.f. satisfies A(x) = exp( 2*x*A(x) / (1-x) ).
 * @author Georg Fischer
 */
public class A360939 extends LambdaSequence {

  /** Construct the sequence. */
  public A360939() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.TWO.pow(k).multiply(Z.valueOf(k + 1).pow(k - 1)).multiply(Binomial.binomial(n - 1, n - k)), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
