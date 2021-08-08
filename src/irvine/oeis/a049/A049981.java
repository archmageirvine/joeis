package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049981 a(n) is the number of arithmetic progressions of positive integers, strictly increasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049981 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049981() {
    super(new A049980());
  }
}
