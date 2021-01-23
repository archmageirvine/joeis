package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084377 a(n) = n^3 + 7.
 * @author Sean A. Irvine
 */
public class A084377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084377() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 8, 15, 34});
  }
}
