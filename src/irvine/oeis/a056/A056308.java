package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056308 Number of reversible strings with n beads using a maximum of six different colors.
 * @author Sean A. Irvine
 */
public class A056308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056308() {
    super(new long[] {-36, 6, 6}, new long[] {1, 6, 21});
  }
}
