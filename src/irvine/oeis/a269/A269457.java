package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269457 a(n) = 5*(n + 1)*(n + 4)/2.
 * @author Sean A. Irvine
 */
public class A269457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269457() {
    super(new long[] {1, -3, 3}, new long[] {10, 25, 45});
  }
}
