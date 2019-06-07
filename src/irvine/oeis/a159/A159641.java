package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159641 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+647)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A159641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159641() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {613, 647, 685, 2993, 3235, 3497});
  }
}
