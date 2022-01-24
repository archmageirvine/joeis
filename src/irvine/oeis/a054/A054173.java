package irvine.oeis.a054;

import irvine.oeis.a020.A020684;

/**
 * A054173 Number of positive integers &lt;= 2^n of form 4 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054173 extends A054150 {

  /** Construct the sequence. */
  public A054173() {
    super(new A020684());
  }
}
