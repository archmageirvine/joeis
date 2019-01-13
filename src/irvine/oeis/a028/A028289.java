package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028289.
 * @author Sean A. Irvine
 */
public class A028289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028289() {
    super(new long[] {-1, 1, 1, 1, -2, -2, 1, 1, 1}, new long[] {1, 1, 2, 4, 5, 7, 11, 13, 17});
  }
}
