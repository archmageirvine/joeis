package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191968 Fibonacci(8n+5) mod Fibonacci(8n+1).
 * @author Sean A. Irvine
 */
public class A191968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191968() {
    super(new long[] {-1, 47}, new long[] {29, 1364});
  }
}
