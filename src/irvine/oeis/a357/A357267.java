package irvine.oeis.a357;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357267 Expansion of e.g.f. -LambertW(x * (1 - exp(x))).
 * @author Georg Fischer
 */
public class A357267 extends LambdaSequence {

  /** Construct the sequence. */
  public A357267() {
    super(0, n -> Rationals.SINGLETON.sum(1, n / 2, k -> new Q(Z.valueOf(k)).pow(k - 1).multiply(Functions.STIRLING2.z(n - k, k)).divide(Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
