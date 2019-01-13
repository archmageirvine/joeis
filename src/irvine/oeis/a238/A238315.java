package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238315.
 * @author Sean A. Irvine
 */
public class A238315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238315() {
    super(new long[] {-4, 12, -11, 1, 3}, new long[] {1, 4, 5, 14, 13});
  }
}
