package irvine.oeis.a054;

import irvine.oeis.a020.A020690;

/**
 * A054187 Number of positive integers &lt;= 2^n of form 7 x^2 + 8 y^2.
 * @author Sean A. Irvine
 */
public class A054187 extends A054150 {

  /** Construct the sequence. */
  public A054187() {
    super(new A020690());
  }
}
