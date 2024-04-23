package irvine.oeis.a073;
// manually 2024-02-06

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A073497 a(n) = n^2 - prime(n).
 * @author Georg Fischer
 */
public class A073497 extends LambdaSequence {

  /** Construct the sequence. */
  public A073497() {
    super(1, n -> Z.valueOf(n).square().subtract(Functions.PRIME.z(n)));
  }
}
