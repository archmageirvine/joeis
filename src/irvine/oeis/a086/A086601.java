package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086601 Triangular numbers <code>+ 1</code> squared.
 * @author Sean A. Irvine
 */
public class A086601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086601() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 16, 49, 121});
  }
}
