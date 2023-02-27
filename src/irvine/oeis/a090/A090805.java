package irvine.oeis.a090;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090805 A simple recurrence with one error.
 * @author Georg Fischer
 */
public class A090805 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090805() {
    super(0, "[[0,1],[0,1],[-1]]", "1,2,6,21,85", 0);
  }
}
