package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092881 Number of ordered 3-multiantichains on an n-set.
 * @author Sean A. Irvine
 */
public class A092881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092881() {
    super(new long[] {-5760, 9072, -5684, 1820, -315, 28}, new long[] {1, 2, 10, 74, 730, 8282});
  }
}
