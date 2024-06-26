package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A122880 Catalan numbers minus odd-indexed Fibonacci numbers.
 * @author Georg Fischer
 */
public class A122880 extends LambdaSequence {

  /** Construct the sequence. */
  public A122880() {
    super(1, n -> Functions.CATALAN.z(n).subtract(Functions.FIBONACCI.z(2 * n - 1)));
  }
}
