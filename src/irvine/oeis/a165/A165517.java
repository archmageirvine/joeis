package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165517.
 * @author Sean A. Irvine
 */
public class A165517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165517() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, 5, 14, 63, 152});
  }
}
