package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159896 Positive numbers y such that y^2 is of the form x^2+(x+839)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159896() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {785, 839, 901, 3809, 4195, 4621});
  }
}
