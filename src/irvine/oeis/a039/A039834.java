package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039834 a(n+2) = -a(n+1) + a(n) (signed Fibonacci numbers) with a(-2) = a(-1) = 1; or Fibonacci numbers (A000045) extended to negative indices.
 * @author Sean A. Irvine
 */
public class A039834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039834() {
    super(new long[] {1, -1}, new long[] {1, 1});
  }
}
