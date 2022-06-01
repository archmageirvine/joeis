package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092796 Number of connected relations.
 * @author Sean A. Irvine
 */
public class A092796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092796() {
    super(new long[] {20106240, -14386144, 4276972, -682172, 62713, -3299, 91}, new long[] {1, 213, 14857, 694485, 27005881, 957263493, 32333393737L});
  }
}
