package irvine.oeis.a159;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A159083 Products of 7 consecutive integers.
 * @author Georg Fischer
 */
public class A159083 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159083() {
    super(0, "[0, 1,-8, 28,-56, 70,-56, 28,-8, 1]", "[0, 0, 0, 0, 0, 0, 0, 5040]", 0);
  }
}
