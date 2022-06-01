package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132594 Values X satisfying the equation: X(X + 1) - 7*Y^2 = 0.
 * @author Sean A. Irvine
 */
public class A132594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132594() {
    super(new long[] {1, -255, 255}, new long[] {0, 63, 16128});
  }
}
