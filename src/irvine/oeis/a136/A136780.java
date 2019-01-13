package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136780.
 * @author Sean A. Irvine
 */
public class A136780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136780() {
    super(new long[] {-7, -8, 7}, new long[] {1, 2, 13});
  }
}
