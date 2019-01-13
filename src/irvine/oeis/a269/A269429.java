package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269429.
 * @author Sean A. Irvine
 */
public class A269429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269429() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 8, -22, 48});
  }
}
