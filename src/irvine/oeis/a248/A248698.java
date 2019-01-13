package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248698.
 * @author Sean A. Irvine
 */
public class A248698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248698() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 23, 166, 621, 1676});
  }
}
