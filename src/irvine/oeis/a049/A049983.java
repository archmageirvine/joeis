package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049983 a(n) is the number of arithmetic progressions of 2 or more positive integers, strictly increasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049983 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049983() {
    super(1, new A049982());
  }
}
