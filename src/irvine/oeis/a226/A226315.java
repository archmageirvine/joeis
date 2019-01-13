package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226315.
 * @author Sean A. Irvine
 */
public class A226315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226315() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 0, 5, 27});
  }
}
