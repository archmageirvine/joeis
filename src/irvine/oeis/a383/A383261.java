package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-11.ack/lambdan at 2025-05-11 22:56

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A383261 Expansion of e.g.f. f(x) * exp(2 * f(x)), where f(x) = (exp(3*x) - 1)/3.
 * @author Georg Fischer
 */
public class A383261 extends LambdaSequence {

  /** Construct the sequence. */
  public A383261() {
    super(0, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).multiply(Z.TWO.pow(k - 1)).multiply(Z.THREE.pow(n - k)).multiply(Functions.STIRLING2.z(n, k))));
  }
}
