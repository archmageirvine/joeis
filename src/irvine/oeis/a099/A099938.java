package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099938 Consider the sequence of circles <code>C0, C1, C2, C3</code> ..., where <code>C0</code> is a half-circle of radius <code>1. C1</code> is the largest circle that fits into <code>C0</code> and has radius <code>1/2. C(n+1)</code> is the largest circle that fits inside <code>C0</code> but outside <code>C(n)</code>, etc. Sequence gives the curvatures (reciprocals of the radii) of the circles.
 * @author Sean A. Irvine
 */
public class A099938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099938() {
    super(new long[] {1, -7, 7}, new long[] {2, 4, 18});
  }
}
