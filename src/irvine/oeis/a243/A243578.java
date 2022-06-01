package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243578 Integers n of the form 8k+7 that are sum of distinct squares of the form m, m+1, m+2, m+4, where m == 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A243578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243578() {
    super(new long[] {1, -3, 3}, new long[] {39, 191, 471});
  }
}
