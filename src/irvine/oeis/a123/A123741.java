package irvine.oeis.a123;
// Generated by gen_seq4.pl 2023-12-07/lambdan at 2023-12-07 22:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A123741 A second version of Fibonacci factorials besides A003266.
 * @author Georg Fischer
 */
public class A123741 extends LambdaSequence {

  /** Construct the sequence. */
  public A123741() {
    super(1, n -> Integers.SINGLETON.product(1, n, j -> Functions.FIBONACCI.z(n + 2).subtract(Functions.FIBONACCI.z(j + 1))));
  }
}
