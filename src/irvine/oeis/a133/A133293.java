package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133293 First differences of A133292.
 * @author Sean A. Irvine
 */
public class A133293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133293() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1}, new long[] {0, 1, 2, 3, -5, 5, -3, -2});
  }
}
