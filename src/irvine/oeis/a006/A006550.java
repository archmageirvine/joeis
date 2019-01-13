package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006550.
 * @author Sean A. Irvine
 */
public class A006550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006550() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 10, 57, 234, 770, 2136});
  }
}

