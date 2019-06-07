package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157257 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+41)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A157257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157257() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {29, 41, 85, 89, 205, 481});
  }
}
