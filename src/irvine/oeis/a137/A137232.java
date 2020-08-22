package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137232 a(n)=-a(n-1)+7a(n-2)+3a(n-3).
 * @author Sean A. Irvine
 */
public class A137232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137232() {
    super(new long[] {3, 7, -1}, new long[] {0, 0, 1});
  }
}
