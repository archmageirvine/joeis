package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105580.
 * @author Sean A. Irvine
 */
public class A105580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105580() {
    super(new long[] {1, -1, -1}, new long[] {-5, 6, 0});
  }
}
