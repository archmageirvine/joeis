package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086640 Arrange <code>n^2</code> octagons that each have area 7 so that they leave <code>(n-1)^2</code> square gaps each with area 2; <code>a(n)</code> is the total area of these polygons.
 * @author Sean A. Irvine
 */
public class A086640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086640() {
    super(new long[] {1, -3, 3}, new long[] {7, 30, 71});
  }
}
