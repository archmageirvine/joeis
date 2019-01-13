package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168329.
 * @author Sean A. Irvine
 */
public class A168329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168329() {
    super(new long[] {-1, 1, 1}, new long[] {3, 3, 9});
  }
}
