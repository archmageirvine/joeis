package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159758 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+79)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A159758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159758() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {65, 79, 101, 289, 395, 541});
  }
}
