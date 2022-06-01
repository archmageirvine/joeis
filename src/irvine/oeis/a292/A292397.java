package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292397 p-INVERT of the tribonacci numbers (A000073(k), k&gt;=2), where p(S) = 1 - S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A292397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292397() {
    super(new long[] {1, 3, 7, 6, 2, -7, -3, -1, 4}, new long[] {1, 3, 10, 33, 108, 352, 1144, 3714, 12050});
  }
}
