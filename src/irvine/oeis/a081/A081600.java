package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081600.
 * @author Sean A. Irvine
 */
public class A081600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081600() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9});
  }
}
