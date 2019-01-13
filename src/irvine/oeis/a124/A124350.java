package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124350.
 * @author Sean A. Irvine
 */
public class A124350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124350() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 24, 60, 144, 260});
  }
}
