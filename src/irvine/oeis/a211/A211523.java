package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211523.
 * @author Sean A. Irvine
 */
public class A211523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211523() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 1, 2, 4, 5, 7});
  }
}
