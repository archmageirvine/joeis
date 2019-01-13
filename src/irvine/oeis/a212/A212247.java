package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212247.
 * @author Sean A. Irvine
 */
public class A212247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212247() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 4, 13, 29});
  }
}
