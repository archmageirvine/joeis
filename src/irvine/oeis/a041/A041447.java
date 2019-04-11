package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041447 Denominators of continued fraction convergents to <code>sqrt(239)</code>.
 * @author Sean A. Irvine
 */
public class A041447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041447() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12390240, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 11, 13, 37, 161, 2452, 9969, 22390, 32359, 184185, 400729, 12206055, 24812839, 136270250, 161083089, 458436428, 1994828801, 30380868443L, 123518302573L, 277417473589L, 400935776162L, 2282096354399L, 4965128484960L});
  }
}
