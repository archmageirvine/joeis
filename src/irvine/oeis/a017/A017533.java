package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017533 a(n) = 12*n + 1.
 * @author Sean A. Irvine
 */
public class A017533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017533() {
    super(new long[] {-1, 2}, new long[] {1, 13});
  }
}
