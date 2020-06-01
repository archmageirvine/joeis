package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039834 <code>a(n+2) = -a(n+1) + a(n)</code> (signed Fibonacci numbers) with <code>a(-2) = a(-1) = 1;</code> or Fibonacci numbers <code>(A000045)</code> extended to negative indices.
 * @author Sean A. Irvine
 */
public class A039834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039834() {
    super(new long[] {1, -1}, new long[] {1, 1});
  }
}
