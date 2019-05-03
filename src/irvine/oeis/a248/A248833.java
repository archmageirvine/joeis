package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248833 The curvature of touching circles inscribed in a special way in the larger segment of circle of radius 1/6 divided by a chord of length <code>sqrt(8/75)</code>.
 * @author Sean A. Irvine
 */
public class A248833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248833() {
    super(new long[] {1, -9, 9}, new long[] {10, 25, 160});
  }
}
