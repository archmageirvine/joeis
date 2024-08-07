package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371147 E.g.f. satisfies A(x) = 1/(1 - x*A(x))^(x^2*A(x)^2).
 * @author Georg Fischer
 */
public class A371147 extends LambdaSequence {

  /** Construct the sequence. */
  public A371147() {
    super(0, n -> n == 0 ? Z.ONE : Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.valueOf(n + 1)).pow(k - 1).multiply(Functions.STIRLING1.z(n - 2L * k, k).abs()).divide(Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
