package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182052 Number of independent sets of nodes in C_6 X C_n (n &gt;= 1).
 * @author Sean A. Irvine
 */
public class A182052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182052() {
    super(new long[] {1, -4, -36, 119, 295, -1032, 115, 1301, -360, -575, 89, 84, 4}, new long[] {18, 1, 199, 1300, 18995, 199821, 2406862, 27285777, 317960739, 3658040968L, 42338077399L, 488631332773L, 5646974285234L});
  }
}
