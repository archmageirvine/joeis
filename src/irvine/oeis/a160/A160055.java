package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160055 Positive numbers y such that y^2 is of the form x^2+(x+89)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A160055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160055() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {65, 89, 149, 241, 445, 829});
  }
}
