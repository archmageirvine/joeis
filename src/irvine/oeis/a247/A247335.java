package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247335 The curvature of touching circles inscribed in a special way in the larger segment of circle of radius <code>10/9</code> divided by a chord of length <code>4/3</code>.
 * @author Sean A. Irvine
 */
public class A247335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247335() {
    super(new long[] {1, -39, 39}, new long[] {1, 10, 361});
  }
}
