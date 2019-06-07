package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159548 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+199)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A159548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159548() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {181, 199, 221, 865, 995, 1145});
  }
}
