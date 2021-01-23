package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017055 a(n) = (7*n + 6)^3.
 * @author Sean A. Irvine
 */
public class A017055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017055() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 2197, 8000, 19683});
  }
}
