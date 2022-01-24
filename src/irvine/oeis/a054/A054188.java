package irvine.oeis.a054;

import irvine.oeis.a020.A020691;

/**
 * A054188 Number of positive integers &lt;= 2^n of form 7 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054188 extends A054150 {

  /** Construct the sequence. */
  public A054188() {
    super(new A020691());
  }
}
