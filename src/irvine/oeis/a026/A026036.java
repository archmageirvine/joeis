package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026036.
 * @author Sean A. Irvine
 */
public class A026036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026036() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {0, 2, 4, 9, 15, 23, 35, 49});
  }
}
