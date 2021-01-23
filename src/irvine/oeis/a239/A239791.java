package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239791 Number of compositions of n with no consecutive 2's.
 * @author Sean A. Irvine
 */
public class A239791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239791() {
    super(new long[] {1, -1, 2, -1, 2}, new long[] {1, 1, 2, 4, 7});
  }
}
