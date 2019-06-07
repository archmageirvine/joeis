package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159626 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+577)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A159626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159626() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {545, 577, 613, 2657, 2885, 3133});
  }
}
