package irvine.oeis.a054;

import irvine.oeis.a020.A020694;

/**
 * A054194 Number of positive integers &lt;= 2^n of form 9 x^2 + 10 y^2.
 * @author Sean A. Irvine
 */
public class A054194 extends A054150 {

  /** Construct the sequence. */
  public A054194() {
    super(new A020694());
  }
}
