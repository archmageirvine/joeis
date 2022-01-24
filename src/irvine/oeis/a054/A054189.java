package irvine.oeis.a054;

import irvine.oeis.a020.A020692;

/**
 * A054189 Number of positive integers &lt;= 2^n of form 7 x^2 + 10 y^2.
 * @author Sean A. Irvine
 */
public class A054189 extends A054150 {

  /** Construct the sequence. */
  public A054189() {
    super(new A020692());
  }
}
