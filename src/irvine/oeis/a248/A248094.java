package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248094 The hyper-Wiener index of the hexagonal triangle T_n, defined in the He et al. reference.
 * @author Sean A. Irvine
 */
public class A248094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248094() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 42, 444, 2187, 7443, 20247, 47313});
  }
}
