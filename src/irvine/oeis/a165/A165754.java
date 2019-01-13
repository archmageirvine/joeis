package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165754.
 * @author Sean A. Irvine
 */
public class A165754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165754() {
    super(new long[] {-1, 1, 1}, new long[] {3, 0, 5});
  }
}
