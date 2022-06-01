package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017449 a(n) = 11*n + 5.
 * @author Sean A. Irvine
 */
public class A017449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017449() {
    super(new long[] {-1, 2}, new long[] {5, 16});
  }
}
