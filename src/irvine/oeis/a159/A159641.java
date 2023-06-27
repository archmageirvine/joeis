package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159641 Positive numbers y such that y^2 is of the form x^2+(x+647)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159641() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {613, 647, 685, 2993, 3235, 3497});
  }
}
