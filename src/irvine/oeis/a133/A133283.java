package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133283 Numbers k such that 30*k^2 + 6 is a square.
 * @author Sean A. Irvine
 */
public class A133283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133283() {
    super(1, new long[] {-1, 22}, new long[] {1, 23});
  }
}
