package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067998 <code>a(n) = n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A067998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067998() {
    super(new long[] {1, -3, 3}, new long[] {0, -1, 0});
  }
}
