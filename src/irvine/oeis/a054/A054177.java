package irvine.oeis.a054;

import irvine.oeis.a020.A020686;

/**
 * A054177 Number of positive integers &lt;= 2^n of form 5 x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054177 extends A054150 {

  /** Construct the sequence. */
  public A054177() {
    super(new A020686());
  }
}
