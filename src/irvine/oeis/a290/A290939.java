package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290939.
 * @author Sean A. Irvine
 */
public class A290939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290939() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 24, 312, 1584, 5376, 14448});
  }
}
