package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157469 Positive numbers y such that y^2 is of the form <code>x^2 + (x+97)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A157469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157469() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {85, 97, 113, 397, 485, 593});
  }
}
