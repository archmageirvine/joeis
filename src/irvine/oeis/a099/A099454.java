package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099454 A Chebyshev transform of A099453 associated to the knot 8_12.
 * @author Sean A. Irvine
 */
public class A099454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099454() {
    super(new long[] {-1, 7, -13, 7}, new long[] {1, 7, 37, 175});
  }
}
