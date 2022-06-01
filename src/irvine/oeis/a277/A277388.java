package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277388 Number of nonnegative solutions of a certain system of linear Diophantine equations depending on an odd parameter.
 * @author Sean A. Irvine
 */
public class A277388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277388() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {3, 47, 306, 1270, 4005, 10493, 24052});
  }
}
