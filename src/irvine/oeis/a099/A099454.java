package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099454 A Chebyshev transform of <code>A099453</code> associated to the knot <code>8_12</code>.
 * @author Sean A. Irvine
 */
public class A099454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099454() {
    super(new long[] {-1, 7, -13, 7}, new long[] {1, 7, 37, 175});
  }
}
