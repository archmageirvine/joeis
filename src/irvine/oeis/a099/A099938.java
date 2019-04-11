package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099938 Consider the sequence of circles C0, C1, C2, C3 <code>...,</code> where C0 is a half-circle of radius <code>1.</code> C1 is the largest circle that fits into C0 and has radius <code>1/2.</code> C(n+1) is the largest circle that fits inside C0 but outside C(n), etc. Sequence gives the curvatures (reciprocals of the radii) of the circles.
 * @author Sean A. Irvine
 */
public class A099938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099938() {
    super(new long[] {1, -7, 7}, new long[] {2, 4, 18});
  }
}
