package irvine.oeis.a054;

import irvine.oeis.a020.A020678;

/**
 * A054162 Number of positive integers &lt;= 2^n of form 3 x^2 + 5 y^2.
 * @author Sean A. Irvine
 */
public class A054162 extends A054150 {

  /** Construct the sequence. */
  public A054162() {
    super(new A020678());
  }
}
