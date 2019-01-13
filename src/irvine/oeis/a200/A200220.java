package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200220.
 * @author Sean A. Irvine
 */
public class A200220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200220() {
    super(new long[] {1, -1, -1, 4, 3, 0}, new long[] {1, 1, 2, 6, 10, 24});
  }
}
