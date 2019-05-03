package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281999 Half of the right Trapezoidal Gnomon's (of the derivate of <code>Y=X^5)</code> height.
 * @author Sean A. Irvine
 */
public class A281999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281999() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 30, 181, 600, 1501, 3150});
  }
}
