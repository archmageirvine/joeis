package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006054.
 * @author Sean A. Irvine
 */
public class A006054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006054() {
    super(new long[] {-1, 1, 2}, new long[] {0, 0, 1});
  }
}

