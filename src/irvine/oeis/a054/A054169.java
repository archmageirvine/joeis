package irvine.oeis.a054;

import irvine.oeis.a020.A020682;

/**
 * A054169 Number of positive integers &lt;= 2^n of form 4 x^2 + 5 y^2.
 * @author Sean A. Irvine
 */
public class A054169 extends A054150 {

  /** Construct the sequence. */
  public A054169() {
    super(new A020682());
  }
}
