package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165220.
 * @author Sean A. Irvine
 */
public class A165220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165220() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 91, 614, 1953});
  }
}
