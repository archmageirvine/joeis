package irvine.oeis.a135;
// manually 2026-07-03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135103 Digital sum (base the n-th prime) of n^3.
 * @author Georg Fischer
 */
public class A135103 extends LambdaSequence {

  /** Construct the sequence. */
  public A135103() {
    super(1, n -> Functions.DIGIT_SUM.z(Functions.PRIME.i(n), Z.valueOf(n).pow(3)));
  }
}
