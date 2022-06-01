package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017187 a(n) = (9*n + 2)^3.
 * @author Sean A. Irvine
 */
public class A017187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017187() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 1331, 8000, 24389});
  }
}
