package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258131 Octagonal numbers (A000567) that are the sum of eleven consecutive octagonal numbers.
 * @author Sean A. Irvine
 */
public class A258131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258131() {
    super(1, new long[] {1, -1, -398, 398, 1}, new long[] {49665, 348161, 19701781, 138502485, 7841194625L});
  }
}
