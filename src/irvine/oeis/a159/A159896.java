package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159896 Positive numbers y such that y^2 is of the form <code>x^2+(x+839)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159896() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {785, 839, 901, 3809, 4195, 4621});
  }
}
