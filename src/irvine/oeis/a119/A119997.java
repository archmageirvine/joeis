package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119997.
 * @author Sean A. Irvine
 */
public class A119997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119997() {
    super(new long[] {-1, 5, -7, 1, 3}, new long[] {1, 1, 4, 5, 17});
  }
}
