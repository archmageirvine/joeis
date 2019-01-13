package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259486.
 * @author Sean A. Irvine
 */
public class A259486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259486() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 7, 19, 43, 73});
  }
}
