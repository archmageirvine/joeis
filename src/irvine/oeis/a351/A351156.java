package irvine.oeis.a351;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351156 Expansion of e.g.f. (1 - x^3/6)^(-x).
 * @author Georg Fischer
 */
public class A351156 extends LambdaSequence {

  /** Construct the sequence. */
  public A351156() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.STIRLING1.z(k, n - 3L * k).abs(), Z.SIX.pow(k).multiply(Functions.FACTORIAL.z(k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
