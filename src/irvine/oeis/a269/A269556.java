package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269556.
 * @author Sean A. Irvine
 */
public class A269556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269556() {
    super(new long[] {1, -99, 99}, new long[] {5, 347, 33865});
  }
}
