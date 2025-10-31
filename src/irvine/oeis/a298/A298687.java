package irvine.oeis.a298;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A298687 Numbers i such that Fibonacci(i) is divisible by i+k for k=0..5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A298687 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A298687() {
    super(1, 2, k -> Fibonacci.fibonacci(k, k) == 0
      && Fibonacci.fibonacci(k, k + 1) == 0
      && Fibonacci.fibonacci(k, k + 2) == 0
      && Fibonacci.fibonacci(k, k + 3) == 0
      && Fibonacci.fibonacci(k, k + 4) == 0
      && Fibonacci.fibonacci(k, k + 5) == 0);
  }
}
