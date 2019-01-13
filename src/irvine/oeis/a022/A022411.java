package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022411.
 * @author Sean A. Irvine
 */
public class A022411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022411() {
    super(new long[] {-1, 0, 2}, new long[] {3, 12, 16});
  }
}
