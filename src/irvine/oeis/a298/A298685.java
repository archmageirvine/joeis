package irvine.oeis.a298;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A298685 Numbers i such that Fibonacci(i) is divisible by i, i+1, i+2, and i+3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A298685 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A298685() {
    super(1, 2, k -> Fibonacci.fibonacci(k, k) == 0
      && Fibonacci.fibonacci(k, k + 1) == 0
      && Fibonacci.fibonacci(k, k + 2) == 0
      && Fibonacci.fibonacci(k, k + 3) == 0);
  }
}
