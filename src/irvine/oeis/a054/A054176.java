package irvine.oeis.a054;

import irvine.oeis.a020.A020685;

/**
 * A054176 Number of positive integers &lt;= 2^n of form 5 x^2 + 6 y^2.
 * @author Sean A. Irvine
 */
public class A054176 extends A054150 {

  /** Construct the sequence. */
  public A054176() {
    super(new A020685());
  }
}
