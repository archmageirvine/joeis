package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067727 a(n) = 7*n^2 + 14*n.
 * @author Sean A. Irvine
 */
public class A067727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067727() {
    super(new long[] {1, -3, 3}, new long[] {21, 56, 105});
  }
}
