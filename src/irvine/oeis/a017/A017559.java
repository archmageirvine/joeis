package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017559 (12n+3)^3.
 * @author Sean A. Irvine
 */
public class A017559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017559() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 3375, 19683, 59319});
  }
}
