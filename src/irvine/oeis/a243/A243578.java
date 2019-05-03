package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243578 Integers n of the form <code>8k+7</code> that are sum of distinct squares of the form m, <code>m+1, m+2, m+4</code>, where m <code>== 1 (mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A243578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243578() {
    super(new long[] {1, -3, 3}, new long[] {39, 191, 471});
  }
}
