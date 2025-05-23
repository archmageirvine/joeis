package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-04-22.ack/lambdan at 2025-04-22 22:21

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A382701 Expansion of e.g.f. -log(1 - x)^3 * exp(3*x) / 6.
 * @author Georg Fischer
 */
public class A382701 extends LambdaSequence {

  /** Construct the sequence. */
  public A382701() {
    super(0, n -> Integers.SINGLETON.sum(3, n, k -> Z.THREE.pow(n - k).multiply(Binomial.binomial(n, k)).multiply((Functions.STIRLING1.z(k, 3)).abs())));
  }
}
