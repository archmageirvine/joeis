package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090391.
 * @author Sean A. Irvine
 */
public class A090391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090391() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 120, 312, 606, 1040, 1661});
  }
}
