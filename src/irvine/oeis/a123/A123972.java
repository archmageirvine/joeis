package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123972.
 * @author Sean A. Irvine
 */
public class A123972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123972() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, -1, 1, 13});
  }
}
