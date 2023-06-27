package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056309 Number of reversible strings with n beads using exactly two different colors.
 * @author Sean A. Irvine
 */
public class A056309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056309() {
    super(1, new long[] {4, -6, 0, 3}, new long[] {0, 1, 4, 8});
  }
}
