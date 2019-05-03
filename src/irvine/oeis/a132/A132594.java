package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132594 Values X satisfying the equation: <code>X(X + 1) - 7*Y^2 = 0</code>.
 * @author Sean A. Irvine
 */
public class A132594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132594() {
    super(new long[] {1, -255, 255}, new long[] {0, 63, 16128});
  }
}
