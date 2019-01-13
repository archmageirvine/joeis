package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239679.
 * @author Sean A. Irvine
 */
public class A239679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239679() {
    super(new long[] {8, -14, 7}, new long[] {7, 13, 31});
  }
}
