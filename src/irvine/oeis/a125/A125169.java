package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125169 a(n) = 16*n + 15.
 * @author Sean A. Irvine
 */
public class A125169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125169() {
    super(new long[] {-1, 2}, new long[] {15, 31});
  }
}
