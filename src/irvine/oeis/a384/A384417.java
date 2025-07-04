package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A384417 Expansion of g.f. cosh(9*arctanh(8*sqrt(x))).
 * @author Georg Fischer
 */
public class A384417 extends LambdaSequence {

  /** Construct the sequence. */
  public A384417() {
    super(0, n -> new Q(16).pow(n).multiply(new Q(105).add(new Q(400).multiply(n)).add(new Q(3392).multiply(new Q(n).square())).add(new Q(512).multiply(new Q(n).pow(3))).add(new Q(4096).multiply(new Q(n).pow(4)))).multiply(Functions.FACTORIAL.z(2 * n)).divide(new Q(105).multiply(new Q(Functions.FACTORIAL.z(n)).square())).num());
  }
}
