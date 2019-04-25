package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157246 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+343)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A157246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157246() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0}, new long[] {245, 265, 287, 343, 427, 493, 637, 833, 1097, 1295, 1715, 2275, 2693, 3577});
  }
}
