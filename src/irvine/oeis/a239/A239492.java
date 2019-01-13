package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239492.
 * @author Sean A. Irvine
 */
public class A239492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239492() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 2, 3, 4, 6});
  }
}
