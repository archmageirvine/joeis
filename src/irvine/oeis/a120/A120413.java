package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120413 Largest even number strictly less than n^2.
 * @author Sean A. Irvine
 */
public class A120413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120413() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {0, 2, 8, 14});
  }
}
