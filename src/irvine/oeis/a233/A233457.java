package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233457 Values of n for which the equation <code>x^2 - 16*y^2 = n</code> has integer solutions.
 * @author Sean A. Irvine
 */
public class A233457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233457() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 4, 9, 16, 17, 20, 25, 33, 36, 41, 48, 49, 52, 57, 64});
  }
}
