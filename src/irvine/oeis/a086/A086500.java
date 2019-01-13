package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086500.
 * @author Sean A. Irvine
 */
public class A086500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086500() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 9, 18, 50, 75, 147, 196});
  }
}
