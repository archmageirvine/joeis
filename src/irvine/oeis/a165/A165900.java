package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165900.
 * @author Sean A. Irvine
 */
public class A165900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165900() {
    super(new long[] {1, -3, 3}, new long[] {-1, -1, 1});
  }
}
