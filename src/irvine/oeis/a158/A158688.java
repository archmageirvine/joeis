package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158688.
 * @author Sean A. Irvine
 */
public class A158688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158688() {
    super(new long[] {1, -3, 3}, new long[] {33, 1122, 4389});
  }
}
