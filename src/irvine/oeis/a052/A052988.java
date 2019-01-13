package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052988.
 * @author Sean A. Irvine
 */
public class A052988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052988() {
    super(new long[] {-1, -1, 2, 2}, new long[] {1, 2, 5, 13});
  }
}
