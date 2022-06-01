package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173391 a(n) = 6n + 3^n.
 * @author Sean A. Irvine
 */
public class A173391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173391() {
    super(new long[] {3, -7, 5}, new long[] {9, 21, 45});
  }
}
