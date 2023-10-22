package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002536 a(n) = 8*a(n-2) - 9*a(n-4).
 * @author Sean A. Irvine
 */
public class A002536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002536() {
    super(new long[] {-9, 0, 8, 0}, new long[] {0, 1, 1, 5});
  }
}
