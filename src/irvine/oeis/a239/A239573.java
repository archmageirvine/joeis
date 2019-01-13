package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239573.
 * @author Sean A. Irvine
 */
public class A239573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239573() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 1, 6, 32, 113, 329, 790, 1702, 3320, 6057, 10400, 17074});
  }
}
