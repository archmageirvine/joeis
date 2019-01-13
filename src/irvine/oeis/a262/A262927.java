package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262927.
 * @author Sean A. Irvine
 */
public class A262927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262927() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 3, 6, 10, 15, 23, 30, 39, 49, 60});
  }
}
