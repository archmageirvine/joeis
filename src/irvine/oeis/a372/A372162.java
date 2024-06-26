package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372162 E.g.f. A(x) satisfies A(x) = exp( x * sqrt(1+2*x) * A(x) ).
 * @author Georg Fischer
 */
public class A372162 extends LambdaSequence {

  /** Construct the sequence. */
  public A372162() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(k + 1).pow(k - 1)).multiply(Z.TWO.pow(n - k)).multiply(Binomial.binomial(new Q(k, 2), n - k)).divide(Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
