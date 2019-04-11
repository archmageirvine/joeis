package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107392 Number of (inequivalent) fuzzy subgroups of the direct sum of group of integers modulo p^n and group of integers modulo 2 for a prime p with (p,2) <code>= 1</code>. Z_{p^n} + Z_2.
 * @author Sean A. Irvine
 */
public class A107392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107392() {
    super(new long[] {-8, 20, -18, 7}, new long[] {7, 31, 103, 303});
  }
}
