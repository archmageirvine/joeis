package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017166 a(n) = (9*n)^6.
 * @author Sean A. Irvine
 */
public class A017166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017166() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 531441, 34012224, 387420489, 2176782336L, 8303765625L, 24794911296L});
  }
}
