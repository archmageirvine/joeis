package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281999 Half of the height of the right trapezoidal gnomon (of the derivative of Y=X^5).
 * @author Sean A. Irvine
 */
public class A281999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281999() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 30, 181, 600, 1501, 3150});
  }
}
