package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211786 n^3 + floor(n^3/2).
 * @author Sean A. Irvine
 */
public class A211786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211786() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 12, 40, 96, 187});
  }
}
