package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249581.
 * @author Sean A. Irvine
 */
public class A249581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249581() {
    super(new long[] {-2, 0, 0, 0, 5, 0, 0, 0}, new long[] {0, 1, 1, 0, 1, 2, 3, 4});
  }
}
