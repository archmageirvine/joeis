package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017130.
 * @author Sean A. Irvine
 */
public class A017130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017130() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 4826809, 85766121, 594823321, 2565726409L, 8303765625L, 22164361129L});
  }
}
