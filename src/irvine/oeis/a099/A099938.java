package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099938 Consider the sequence of circles C0, C1, C2, C3 ..., where C0 is a half-circle of radius 1. C1 is the largest circle that fits into C0 and has radius 1/2. C(n+1) is the largest circle that fits inside C0 but outside C(n), etc. Sequence gives the curvatures (reciprocals of the radii) of the circles.
 * @author Sean A. Irvine
 */
public class A099938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099938() {
    super(1, new long[] {1, -7, 7}, new long[] {2, 4, 18});
  }
}
