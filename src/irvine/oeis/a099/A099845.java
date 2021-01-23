package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099845 A Chebyshev transform of A090400 related to the knot 8_2.
 * @author Sean A. Irvine
 */
public class A099845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099845() {
    super(new long[] {-1, 3, -3, 3, -3, 3}, new long[] {1, 3, 8, 18, 37, 75});
  }
}
