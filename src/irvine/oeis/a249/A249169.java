package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249169 Fibonacci 16-step numbers, <code>a(n) = a(n-1) + a(n-2) +</code> ... <code>+ a(n-16)</code>.
 * @author Sean A. Irvine
 */
public class A249169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249169() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384});
  }
}
