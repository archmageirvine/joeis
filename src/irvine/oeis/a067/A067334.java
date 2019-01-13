package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067334.
 * @author Sean A. Irvine
 */
public class A067334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067334() {
    super(new long[] {-1, -2, 1, 2}, new long[] {8, 21, 50, 105});
  }
}
