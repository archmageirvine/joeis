package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165192.
 * @author Sean A. Irvine
 */
public class A165192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165192() {
    super(new long[] {-1, 0, 1}, new long[] {1, 2, 3});
  }
}
