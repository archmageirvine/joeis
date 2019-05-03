package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203172 Alternating sum of the fourth powers of the first <code>n odd-indexed</code> Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A203172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203172() {
    super(new long[] {1, 54, 330, 0, -330, -54}, new long[] {0, -1, 15, -610, 27951, -1308385});
  }
}
