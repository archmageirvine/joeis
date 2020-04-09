package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067749 Numbers k such that k and <code>3^k</code> end with the same two digits.
 * @author Sean A. Irvine
 */
public class A067749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067749() {
    super(new long[] {-1, 2}, new long[] {87, 187});
  }
}
