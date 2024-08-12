package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049440 a(n) = Fib(3*n)^2 - 2*Fib(3*n) + 4*Fib(3*n+1) + 5, where Fib = A000045.
 * @author Sean A. Irvine
 */
public class A049440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049440() {
    super(new long[] {-1, 14, 73, -36, -71, 22}, new long[] {9, 17, 105, 1313, 21385, 374833});
  }
}
