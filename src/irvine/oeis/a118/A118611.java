package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118611.
 * @author Sean A. Irvine
 */
public class A118611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118611() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 1}, new long[] {0, 77, 132, 245, 392, 585, 728, 1029, 1428, 1725, 2352, 3185, 4292, 5117, 6860});
  }
}
