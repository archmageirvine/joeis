package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017211 a(n) = (9*n + 4)^3.
 * @author Sean A. Irvine
 */
public class A017211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017211() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 2197, 10648, 29791});
  }
}
