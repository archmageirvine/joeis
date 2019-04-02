package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008646 Molien series for cyclic group of order 5.
 * @author Sean A. Irvine
 */
public class A008646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008646() {
    super(new long[] {1, -4, 6, -4, 1, -1, 4, -6, 4}, new long[] {1, 1, 3, 7, 14, 26, 42, 66, 99});
  }
}

