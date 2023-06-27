package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142888 First differences of A142705.
 * @author Sean A. Irvine
 */
public class A142888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142888() {
    super(1, new long[] {-1, -1, 2, 2, -1}, new long[] {3, -1, 13, -9, 29});
  }
}
