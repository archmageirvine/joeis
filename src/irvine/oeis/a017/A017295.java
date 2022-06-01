package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017295 (10*n+2)^3.
 * @author Sean A. Irvine
 */
public class A017295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017295() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 1728, 10648, 32768});
  }
}
