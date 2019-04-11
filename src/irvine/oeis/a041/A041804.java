package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041804 Numerators of continued fraction convergents to <code>sqrt(423)</code>.
 * @author Sean A. Irvine
 */
public class A041804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041804() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9214, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 21, 41, 144, 617, 1995, 2612, 4607, 186892, 191499, 378391, 1326672, 5685079, 18381909, 24066988, 42448897});
  }
}
