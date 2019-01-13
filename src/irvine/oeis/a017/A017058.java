package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017058.
 * @author Sean A. Irvine
 */
public class A017058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017058() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 4826809, 64000000, 387420489, 1544804416, 4750104241L, 12230590464L});
  }
}
