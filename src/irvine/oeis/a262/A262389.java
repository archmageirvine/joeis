package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262389.
 * @author Sean A. Irvine
 */
public class A262389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262389() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 6, 8, 9, 14});
  }
}
