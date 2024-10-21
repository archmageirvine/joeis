package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A072695 a(n) = lcm(d(n^2),d(n)), where d(n) = A000005, the number of divisors of n.
 * @author Georg Fischer
 */
public class A072695 extends LambdaSequence {

  /** Construct the sequence. */
  public A072695() {
    super(1, n -> Functions.SIGMA0.z((long) n * n).lcm(Functions.SIGMA0.z(n)));
  }
}
