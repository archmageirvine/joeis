package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-11.ack/lambdan at 2024-09-11 23:28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375558 Expansion of e.g.f. 1 / (1 + x * log(1 - x^4/24)).
 * @author Georg Fischer
 */
public class A375558 extends LambdaSequence {

  /** Construct the sequence. */
  public A375558() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Functions.FACTORIAL.z(n - 4 * k).multiply(Functions.STIRLING1.z(k, n - 4L * k).abs()), Z.valueOf(24).pow(k).multiply(Functions.FACTORIAL.z(k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
