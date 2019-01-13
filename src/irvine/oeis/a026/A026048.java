package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026048.
 * @author Sean A. Irvine
 */
public class A026048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026048() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {15, 21, 28, 39, 52, 68, 88, 111});
  }
}
