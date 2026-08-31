package irvine.oeis.a086;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A086391 Numbers k such that F(k^2+1) == 1 (mod k) where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A086391 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086391() {
    super(1, 2, k -> Fibonacci.fibonacci(k * k + 1, k) == 1);
  }
}

