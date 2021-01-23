package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132593 Nonnegative integer solutions X to the equation: X(X + 1) - 10*Y^2 = 0.
 * @author Sean A. Irvine
 */
public class A132593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132593() {
    super(new long[] {1, -39, 39}, new long[] {0, 9, 360});
  }
}
