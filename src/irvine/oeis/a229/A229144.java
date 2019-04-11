package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229144 Partial sums of (Fibonacci numbers <code>mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A229144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229144() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 4, 6, 8, 9, 9});
  }
}
