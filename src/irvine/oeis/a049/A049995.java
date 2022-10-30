package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049995 Number of arithmetic progressions of 4 or more positive integers, nondecreasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049995 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049995() {
    super(1, new A049994());
  }
}
