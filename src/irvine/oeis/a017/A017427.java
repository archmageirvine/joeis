package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017427 (11n+3)^3.
 * @author Sean A. Irvine
 */
public class A017427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017427() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 2744, 15625, 46656});
  }
}
