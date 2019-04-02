package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052101 One of the three sequences associated with the polynomial x^3 - 2.
 * @author Sean A. Irvine
 */
public class A052101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052101() {
    super(new long[] {3, -3, 3}, new long[] {1, 1, 1});
  }
}
