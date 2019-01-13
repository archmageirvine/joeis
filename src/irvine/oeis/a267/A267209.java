package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267209.
 * @author Sean A. Irvine
 */
public class A267209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267209() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 11, 111, 1110});
  }
}
