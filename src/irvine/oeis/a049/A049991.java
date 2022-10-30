package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049991 a(n) is the number of arithmetic progressions of 2 or more positive integers, nondecreasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049991 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049991() {
    super(1, new A049990());
  }
}
