package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220493 Fibonacci 15-step numbers, <code>a(n) = a(n-1) + a(n-2) +</code> ... <code>+ a(n-15)</code>.
 * @author Sean A. Irvine
 */
public class A220493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220493() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192});
  }
}
