package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017127 a(n) = (8*n + 5)^3.
 * @author Sean A. Irvine
 */
public class A017127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017127() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 2197, 9261, 24389});
  }
}
