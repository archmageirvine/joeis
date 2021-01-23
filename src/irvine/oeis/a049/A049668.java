package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049668 a(n) = Fibonacci(8*n)/21.
 * @author Sean A. Irvine
 */
public class A049668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049668() {
    super(new long[] {-1, 47}, new long[] {0, 1});
  }
}
