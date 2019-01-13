package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098532.
 * @author Sean A. Irvine
 */
public class A098532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098532() {
    super(new long[] {-1, 13, 104, -260, -260, 104, 13}, new long[] {0, 1, 2, 66, 795, 16420, 278564});
  }
}
