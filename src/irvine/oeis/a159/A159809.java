package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159809 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+223)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A159809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159809() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {197, 223, 257, 925, 1115, 1345});
  }
}
