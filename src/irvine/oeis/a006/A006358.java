package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006358.
 * @author Sean A. Irvine
 */
public class A006358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006358() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 5, 15, 55, 190});
  }
}

