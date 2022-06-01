package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211784 n^2 + floor(n^2/2) + floor(n^2/3).
 * @author Sean A. Irvine
 */
public class A211784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211784() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 7, 16, 29, 45, 66});
  }
}
