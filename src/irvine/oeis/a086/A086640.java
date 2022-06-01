package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086640 Arrange n^2 octagons that each have area 7 so that they leave (n-1)^2 square gaps each with area 2; a(n) is the total area of these polygons.
 * @author Sean A. Irvine
 */
public class A086640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086640() {
    super(new long[] {1, -3, 3}, new long[] {7, 30, 71});
  }
}
