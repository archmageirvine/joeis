package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020715 n+6.
 * @author Sean A. Irvine
 */
public class A020715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020715() {
    super(new long[] {-1, 2}, new long[] {6, 7});
  }
}
