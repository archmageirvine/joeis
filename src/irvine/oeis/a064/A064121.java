package irvine.oeis.a064;

import irvine.oeis.PrependSequence;

/**
 * A064121 Nonprime numbers n such that the sum of aliquot divisors of n (A001065) and product of aliquot divisors of n (A048741) are both perfect squares.
 * @author Sean A. Irvine
 */
public class A064121 extends PrependSequence {

  /** Construct the sequence. */
  public A064121() {
    super(1, new A064116(), 1);
  }
}

