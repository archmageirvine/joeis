package irvine.oeis.a195;
// Generated by gen_seq4.pl 2024-06-06/lambdan at 2024-06-06 20:10

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A195256 O.g.f.: Sum_{n&gt;=0} 4*(n+4)^(n-1)*x^n/(1+n*x)^n.
 * @author Georg Fischer
 */
public class A195256 extends LambdaSequence {

  /** Construct the sequence. */
  public A195256() {
    super(0, n -> n == 0 ? Z.ONE : Rationals.SINGLETON.sum(1, n, k -> new Q(Z.FOUR.pow(k), Functions.FACTORIAL.z(k - 1))).multiply(Functions.FACTORIAL.z(n - 1)).num());
  }
}
