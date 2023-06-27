package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056326 Number of reversible string structures with n beads using exactly two different colors.
 * @author Sean A. Irvine
 */
public class A056326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056326() {
    super(1, new long[] {4, -6, 0, 3}, new long[] {0, 1, 2, 5});
  }
}
