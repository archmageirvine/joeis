package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049993 a(n) is the number of arithmetic progressions of 3 or more positive integers, nondecreasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049993 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049993() {
    super(new A049992());
  }
}
