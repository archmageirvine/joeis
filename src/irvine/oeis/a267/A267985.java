package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267985.
 * @author Sean A. Irvine
 */
public class A267985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267985() {
    super(new long[] {-1, 1, 1}, new long[] {7, 13, 37});
  }
}
