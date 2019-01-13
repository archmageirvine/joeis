package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064412.
 * @author Sean A. Irvine
 */
public class A064412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064412() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 5, 14, 32, 60, 103, 160, 238});
  }
}
