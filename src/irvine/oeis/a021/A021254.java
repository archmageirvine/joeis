package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021254.
 * @author Sean A. Irvine
 */
public class A021254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021254() {
    super(new long[] {-168, 290, -143, 22}, new long[] {1, 22, 341, 4646});
  }
}
