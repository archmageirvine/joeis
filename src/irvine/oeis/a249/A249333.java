package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249333 Number of regions formed by extending the sides of a regular n-gon.
 * @author Sean A. Irvine
 */
public class A249333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249333() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {7, 9, 16, 19, 29});
  }
}
