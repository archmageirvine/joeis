package irvine.oeis.a054;

import irvine.oeis.a020.A020688;

/**
 * A054179 Number of positive integers &lt;= 2^n of form 5 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054179 extends A054150 {

  /** Construct the sequence. */
  public A054179() {
    super(new A020688());
  }
}
