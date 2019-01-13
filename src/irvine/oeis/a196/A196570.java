package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196570.
 * @author Sean A. Irvine
 */
public class A196570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196570() {
    super(new long[] {2, -2, -4, 2, 4, 1}, new long[] {0, 4, 6, 18, 48, 118});
  }
}
