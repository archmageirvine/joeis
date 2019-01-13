package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122611.
 * @author Sean A. Irvine
 */
public class A122611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122611() {
    super(new long[] {-1, -6, 11, 6, -15, 7}, new long[] {1, 7, 34, 139, 516, 1802});
  }
}
