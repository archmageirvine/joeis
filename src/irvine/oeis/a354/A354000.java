package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A354000 Expansion of e.g.f. exp(x^2/2 * (exp(x) - 1)).
 * @author Georg Fischer
 */
public class A354000 extends LambdaSequence {

  /** Construct the sequence. */
  public A354000() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.STIRLING2.z(n - 2L * k, k), Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(n - 2 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
