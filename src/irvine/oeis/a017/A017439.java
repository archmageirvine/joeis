package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017439 (11n+4)^3.
 * @author Sean A. Irvine
 */
public class A017439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017439() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 3375, 17576, 50653});
  }
}
