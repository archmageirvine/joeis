package irvine.oeis.a231;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A231485 Number of perfect matchings in the graph C_5 X C_{2n}.
 * @author Sean A. Irvine
 */
public class A231485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231485() {
    super(2, new long[] {1, -29, 261, -1029, 2001, -2001, 1029, -261, 29}, new long[] {722, 9922, 155682, 2540032, 41934482, 694861522, 11527389122L, 191304901282L, 3175220160032L});
  }
}
