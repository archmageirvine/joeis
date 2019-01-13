package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282817.
 * @author Sean A. Irvine
 */
public class A282817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282817() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 6, 72, 375, 1320});
  }
}
