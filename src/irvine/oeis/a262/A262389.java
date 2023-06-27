package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262389 Numbers whose last digit is composite.
 * @author Sean A. Irvine
 */
public class A262389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262389() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {4, 6, 8, 9, 14});
  }
}
