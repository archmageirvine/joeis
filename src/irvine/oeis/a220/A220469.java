package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220469 Fibonacci 14-step numbers, a(n) = a(n-1) + a(n-2) + ... + a(n-14).
 * @author Sean A. Irvine
 */
public class A220469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220469() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096});
  }
}
