package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031138 Numbers k such that 1^5 + 2^5 + ... + k^5 is a square.
 * @author Sean A. Irvine
 */
public class A031138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031138() {
    super(new long[] {1, -11, 11}, new long[] {1, 13, 133});
  }
}
