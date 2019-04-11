package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292397 p-INVERT of the tribonacci numbers (A000073(k), <code>k&gt;=2),</code> where p(S) <code>= 1 -</code> S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A292397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292397() {
    super(new long[] {1, 3, 7, 6, 2, -7, -3, -1, 4}, new long[] {1, 3, 10, 33, 108, 352, 1144, 3714, 12050});
  }
}
