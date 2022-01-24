package irvine.oeis.a054;

import irvine.oeis.a020.A020676;

/**
 * A054159 Number of positive integers &lt;= 2^n of form 2 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054159 extends A054150 {

  /** Construct the sequence. */
  public A054159() {
    super(new A020676());
  }
}
