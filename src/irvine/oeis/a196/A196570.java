package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196570 LAN party numbers.
 * @author Sean A. Irvine
 */
public class A196570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196570() {
    super(1, new long[] {2, -2, -4, 2, 4, 1}, new long[] {0, 4, 6, 18, 48, 118});
  }
}
