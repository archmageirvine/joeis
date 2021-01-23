package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156561 Floor(Fibonacci(2n+1)/9).
 * @author Sean A. Irvine
 */
public class A156561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156561() {
    super(new long[] {1, -4, 4, -1, 0, 0, 1, -4, 4}, new long[] {0, 0, 0, 1, 3, 9, 25, 67, 177});
  }
}
