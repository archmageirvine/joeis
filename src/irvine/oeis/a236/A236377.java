package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236377 Real part of <code>Sum_{k=0..n} (k + i^k)^2,</code> where <code>i=sqrt(-1)</code>.
 * @author Sean A. Irvine
 */
public class A236377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236377() {
    super(new long[] {-1, 3, -4, 4, -2, -2, 4, -4, 3}, new long[] {1, 1, 2, 10, 35, 59, 84, 132, 213});
  }
}
