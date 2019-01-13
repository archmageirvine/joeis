package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278137.
 * @author Sean A. Irvine
 */
public class A278137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278137() {
    super(new long[] {-1, -2, 0, 2, 1}, new long[] {1, 3, 4, 8, 13});
  }
}
