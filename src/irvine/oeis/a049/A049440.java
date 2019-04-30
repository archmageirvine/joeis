package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049440 <code>Fib(3n)^2 - 2*Fib(3n) + 4*Fib(3n+1) + 5</code>.
 * @author Sean A. Irvine
 */
public class A049440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049440() {
    super(new long[] {-1, 14, 73, -36, -71, 22}, new long[] {9, 17, 105, 1313, 21385, 374833});
  }
}
