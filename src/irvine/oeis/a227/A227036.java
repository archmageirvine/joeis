package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227036.
 * @author Sean A. Irvine
 */
public class A227036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227036() {
    super(new long[] {-2, 2, -1, 2}, new long[] {2, 4, 8, 16});
  }
}
