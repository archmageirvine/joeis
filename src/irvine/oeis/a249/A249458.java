package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249458 The numerators of curvatures of touching circles inscribed in a special way in the smaller segment of unit circle divided by a chord of length <code>sqrt(84)/5</code>.
 * @author Sean A. Irvine
 */
public class A249458 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A249458() {
    super(new long[] {343, -231, 33}, new long[] {10, 100, 1690});
  }
}
