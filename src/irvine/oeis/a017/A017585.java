package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017585 (12n+5)^5.
 * @author Sean A. Irvine
 */
public class A017585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017585() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 1419857, 20511149, 115856201, 418195493, 1160290625});
  }
}
