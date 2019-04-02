package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027558 Number of 3-unbalanced strings of length n (=2^n-A027557[ n ]).
 * @author Sean A. Irvine
 */
public class A027558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027558() {
    super(new long[] {4, 2, -8, 1, 3}, new long[] {0, 0, 0, 0, 2});
  }
}
