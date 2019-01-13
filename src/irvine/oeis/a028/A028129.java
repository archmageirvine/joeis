package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028129.
 * @author Sean A. Irvine
 */
public class A028129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028129() {
    super(new long[] {-2640, 1648, -359, 32}, new long[] {1, 32, 665, 11440});
  }
}
