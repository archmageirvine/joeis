package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157213 Positive numbers y such that y^2 is of the form x^2+(x+137)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A157213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157213() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {97, 137, 277, 305, 685, 1565});
  }
}
