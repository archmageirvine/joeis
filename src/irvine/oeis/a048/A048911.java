package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048911 Indices of square numbers which are also 9-gonal.
 * @author Sean A. Irvine
 */
public class A048911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048911() {
    super(1, new long[] {-1, 0, 30, 0}, new long[] {1, 3, 33, 91});
  }
}
