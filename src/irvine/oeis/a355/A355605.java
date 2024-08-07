package irvine.oeis.a355;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A355605 Expansion of e.g.f. (1 + x)^(x^2/2).
 * @author Georg Fischer
 */
public class A355605 extends LambdaSequence {

  /** Construct the sequence. */
  public A355605() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.STIRLING1.z(n - 2L * k, k), Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(n - 2 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
