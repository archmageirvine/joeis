package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005690 Number of Twopins positions.
 * @author Georg Fischer
 */
public class A005690 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005690() {
    super(8, "[0, 1, 0, 0, 0, 0, 2,-2, 0,-1, 2, 0,-2, 1]", "1", 0);
  }
}
