package irvine.oeis.a298;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A298684 Numbers i such that Fibonacci(i) is divisible by i, i+1, and i+2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A298684 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A298684() {
    super(1, 2, k -> Fibonacci.fibonacci(k, k) == 0
      && Fibonacci.fibonacci(k, k + 1) == 0
      && Fibonacci.fibonacci(k, k + 2) == 0);
  }
}
