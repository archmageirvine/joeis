package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267353.
 * @author Sean A. Irvine
 */
public class A267353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267353() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 6, 12, 15});
  }
}
