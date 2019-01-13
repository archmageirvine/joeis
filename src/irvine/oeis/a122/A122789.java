package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122789.
 * @author Sean A. Irvine
 */
public class A122789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122789() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 1, 0});
  }
}
