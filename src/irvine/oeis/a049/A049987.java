package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049987 a(n) is the number of arithmetic progressions of 4 or more positive integers, strictly increasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049987 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049987() {
    super(1, new A049986());
  }
}
