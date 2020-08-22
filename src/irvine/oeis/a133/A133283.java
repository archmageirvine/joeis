package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133283 Numbers n such that 30*n^2 + 6 is a square.
 * @author Sean A. Irvine
 */
public class A133283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133283() {
    super(new long[] {-1, 22}, new long[] {1, 23});
  }
}
