package irvine.oeis.a054;

import irvine.oeis.a020.A020681;

/**
 * A054167 Number of positive integers &lt;= 2^n of form 3 x^2 + 10 y^2.
 * @author Sean A. Irvine
 */
public class A054167 extends A054150 {

  /** Construct the sequence. */
  public A054167() {
    super(new A020681());
  }
}
