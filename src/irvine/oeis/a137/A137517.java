package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137517 a(0) = 121; for n&gt;0, a(n) = a(n-1) - n + 1.
 * @author Sean A. Irvine
 */
public class A137517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137517() {
    super(new long[] {1, -3, 3}, new long[] {121, 121, 120});
  }
}
