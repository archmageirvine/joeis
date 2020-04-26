package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249457 The numerator of curvatures of touching circles inscribed in a special way in the larger segment of a unit circle divided by a chord of length <code>sqrt(84)5</code>.
 * @author Sean A. Irvine
 */
public class A249457 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A249457() {
    super(new long[] {27, -111, 37}, new long[] {10, 100, 2890});
  }
}
