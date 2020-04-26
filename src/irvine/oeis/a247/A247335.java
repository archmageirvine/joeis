package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247335 The curvature of touching circles inscribed in a special way in the larger segment of circle of radius 10/9 divided by a chord of length 4/3.
 * @author Sean A. Irvine
 */
public class A247335 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A247335() {
    super(new long[] {1, -39, 39}, new long[] {1, 10, 361});
  }
}
