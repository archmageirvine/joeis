package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081075 a(n) = Fibonacci(4n+2) - 3.
 * @author Sean A. Irvine
 */
public class A081075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081075() {
    super(new long[] {1, -8, 8}, new long[] {5, 52, 374});
  }
}
