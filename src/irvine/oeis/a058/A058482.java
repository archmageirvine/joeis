package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058482 Number of 3 X n binary matrices with no zero rows or columns.
 * @author Sean A. Irvine
 */
public class A058482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058482() {
    super(new long[] {21, -31, 11}, new long[] {1, 25, 265});
  }
}
