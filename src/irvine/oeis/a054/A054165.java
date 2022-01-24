package irvine.oeis.a054;

import irvine.oeis.a020.A020680;

/**
 * A054165 Number of positive integers &lt;= 2^n of form 3 x^2 + 8 y^2.
 * @author Sean A. Irvine
 */
public class A054165 extends A054150 {

  /** Construct the sequence. */
  public A054165() {
    super(new A020680());
  }
}
