package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017429.
 * @author Sean A. Irvine
 */
public class A017429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017429() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 537824, 9765625, 60466176, 229345007, 656356768});
  }
}
