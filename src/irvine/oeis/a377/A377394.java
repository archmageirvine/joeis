package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-28.ack/lambdan at 2024-10-28 19:20

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A377394 Expansion of e.g.f. (1 - log(1-x))^3.
 * @author Georg Fischer
 */
public class A377394 extends LambdaSequence {

  /** Construct the sequence. */
  public A377394() {
    super(0, n -> Integers.SINGLETON.sum(0, 3, k -> Functions.FACTORIAL.z(k).multiply(Binomial.binomial(3, k)).multiply(Functions.STIRLING1.z(n, k).abs())));
  }
}
