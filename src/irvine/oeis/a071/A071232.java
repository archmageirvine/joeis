package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071232.
 * @author Sean A. Irvine
 */
public class A071232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071232() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 36, 378, 2080, 7875, 23436});
  }
}
