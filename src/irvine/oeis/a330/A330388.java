package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000593;

/**
 * A330388 Expansion of e.g.f. Sum_{k&gt;=1} (-1)^(k + 1) * log(1 + x)^k / (k * (1 - log(1 + x)^k)).
 * @author Georg Fischer
 */
public class A330388 extends LambdaSequence {

  private static final DirectSequence A000593 = new A000593();

  /** Construct the sequence. */
  public A330388() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.STIRLING1.z(n, k).multiply(Functions.FACTORIAL.z(k - 1)).multiply(A000593.a(k))));
  }
}
