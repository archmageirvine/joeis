package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248598.
 * @author Sean A. Irvine
 */
public class A248598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248598() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 54, 174});
  }
}
