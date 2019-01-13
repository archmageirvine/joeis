package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142879.
 * @author Sean A. Irvine
 */
public class A142879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142879() {
    super(new long[] {-1, 0, 0, 5, 0, 0}, new long[] {0, 1, 2, 5, 7, 9});
  }
}
