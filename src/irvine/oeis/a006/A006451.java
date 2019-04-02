package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006451 Numbers n such that n*(n+1)/2+1 is a square.
 * @author Sean A. Irvine
 */
public class A006451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006451() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 2, 5, 15, 32});
  }
}

