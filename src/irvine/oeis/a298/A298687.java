package irvine.oeis.a298;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A221018 Number n such that Fibonacci(n) is divisible by n, n + 1 and n - 1.
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
