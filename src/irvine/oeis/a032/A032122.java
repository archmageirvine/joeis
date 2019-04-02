package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032122 Number of reversible strings with n beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032122() {
    super(new long[] {-25, 5, 5}, new long[] {1, 5, 15});
  }
}
