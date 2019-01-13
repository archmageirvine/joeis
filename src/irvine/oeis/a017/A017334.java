package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017334.
 * @author Sean A. Irvine
 */
public class A017334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017334() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 11390625, 244140625, 1838265625, 8303765625L, 27680640625L, 75418890625L});
  }
}
