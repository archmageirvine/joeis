package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006368.
 * @author Sean A. Irvine
 */
public class A006368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006368() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 3, 2, 6, 4});
  }
}

