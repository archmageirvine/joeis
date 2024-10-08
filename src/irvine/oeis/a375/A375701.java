package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-02.ack/lambdan at 2024-09-02 22:06

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375701 Expansion of e.g.f. 1 / sqrt(1 + x^3 * log(1 - x)).
 * @author Georg Fischer
 */
public class A375701 extends LambdaSequence {

  /** Construct the sequence. */
  public A375701() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(6L * j + 3)).multiply(Functions.STIRLING1.z(n - 3L * k, k).abs()), Z.SIX.pow(k).multiply(Functions.FACTORIAL.z(n - 3 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
