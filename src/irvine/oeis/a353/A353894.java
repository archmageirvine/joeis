package irvine.oeis.a353;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353894 Expansion of e.g.f. exp( (x * (exp(x) - 1))^2 / 4 ).
 * @author Georg Fischer
 */
public class A353894 extends LambdaSequence {

  /** Construct the sequence. */
  public A353894() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Functions.FACTORIAL.z(2 * k).multiply(Functions.STIRLING2.z(n - 2L * k, 2L * k)), Z.FOUR.pow(k).multiply(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - 2 * k))))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
