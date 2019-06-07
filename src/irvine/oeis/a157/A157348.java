package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157348 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+281)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A157348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157348() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {229, 281, 365, 1009, 1405, 1961});
  }
}
